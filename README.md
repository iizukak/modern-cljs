# modern-cljs

An implementation of [Modern ClojureScript](https://github.com/magomimmo/modern-cljs)


## Usage

Add `[lein-ring "0.8.13"]` to your `~/.lein/profile.clj`

```
# Build Project
$ lein do cljsbuild clean, cljsbuild once

# Run bREPL
$ lein trampoline cljsbuild repl-listen

# Run Ring
$ lein ring server
# then access http://localhost:3000/
```

## dependent libraries

- lein-cljsbuild
  - Build CLJ to CLJS
- composure
  - lightweight webapplication framework
- ring
  - routing library

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
