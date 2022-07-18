mvn clean package
if [ `uname` = 'Linux' ]; then
	mkdir -p scratch
	cp main/target/*.jar scratch
	docker build -t ${IMAGE_NAME} -f Dockerfile scratch
	if [ "$#" -eq 2 ]; then
		docker login -u $1 -p $2
		docker push ${IMAGE_NAME}
	fi
fi

