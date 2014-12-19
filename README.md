# modern-cljs

An implementation of [Modern ClojureScript](https://github.com/magomimmo/modern-cljs)


## Usage

```
# Build Project
$ lein do cljsbuild clean, cljsbuild once

# Run bREPL
$ lein trampoline cljsbuild repl-listen

# Run Python HttpServer
$ cd /path/to/modern-cljs/resources/public
$ python -m SimpleHTTPServer 8888

# Run Ring
$ lein ring server
http://localhost:3000/
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
