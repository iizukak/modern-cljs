# modern-cljs

An implementation of [Modern ClojureScript](https://github.com/magomimmo/modern-cljs)


## Usage
Add `[lein-ring "0.8.13"]` to your `~/.lein/profile.clj`

```
lein cljsbuild clean
lein clean
lein cljsbuild once
lein ring server
lein trampoline cljsbuild repl-listen
# then access http://localhost:3000/
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
