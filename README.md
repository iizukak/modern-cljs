# modern-cljs

An implementation of [Modern ClojureScript](https://github.com/magomimmo/modern-cljs)


## Usage
Add `[lein-ring "0.8.13"]` to your `~/.lein/profile.clj`

```
lein do clean, cljsbuild clean, lein cljsbuild auto dev
lein ring server # from the project home directory
lein trampoline cljsbuild repl-listen # from the project home directory in a new terminal
# then access http://localhost:3000/
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
