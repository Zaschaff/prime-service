set -u # or set -o nounset
💡"$VERSION"

docker build -t ghcr.io/hbahrami/prime-service:$VERSION --file ./Dockerfile . 