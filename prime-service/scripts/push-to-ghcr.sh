set -u # or set -o nounset
: "$VERSION"
: "$ACCESS_TOKEN"

echo $ACCESS_TOKEN | docker login ghcr.io --username hbahrami --password-stdin
docker push ghcr.io/hbahrami/prime-service:$VERSION 