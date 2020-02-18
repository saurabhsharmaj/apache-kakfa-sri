FROM docker.target.com/tap/alpine-jre

ADD build/distributions/nridataindex.tar /

ENTRYPOINT ["/nridataindex/bin/nridataindex"]