# Changelog

## Version 0.10 — 2025-06-19

- Add `nomis/ec-cycle-mode-and-brightness` command.

- Make overlay priorities less intrusive by using values of the form `(cons nil ...)`.


## Version 0.9 — 2025-04-13

- Get rid of `:new-default-site` in parser specs.

- Don't color comments or metadata.

- Handle `@`.

- Don't highlight backquote as unparsable (but also don't understand backquote/unquote semantics).

- Make unparsable face less intrusive — underline instead of box.

- Always site hosted anonymous functions.


## Version 0.8 — 2025-04-03

- No change in functionality, but update some docs:
  - Update screenshots
  - Update examples of built-in parser definitions in README


## Version 0.7 — 2025-04-03

- Site the parentheses and the operator of Electric calls.

- Site all scalar hosted call args.

- Give error feedback for `(e/fn ...)` in operator position.


## Version 0.6 — 2025-03-31

- Breaking change: Rename the package as `nomis-ec-mode`.
  - When upgrading you should delete the old `nomis-electric-clojure.el` file or `nomis-electric-clojure-mode` directory. See the README for details.
  - Use `(require 'nomis-ec-mode)` instead of `(require 'nomis-electric-clojure)`.

- Add `nomis/ec-version` constant and `nomis/ec-version` interactive command.

- Understand comments.

- Understand that commas are whitespace.

- Add `nomis/ec-base-priority-for-overlays`.

- Fix some obscure mis-coloring. (Fixed as a result of refactoring internals to make things less magical and more obviously correct.)


## Version 0.5 — 2025-03-25

- Add support for multiple arities in `e/defn` and `e/fn`.

- Skip metadata.

- Don't site symbols that are Electric function names.

- Don't make locals in `binding`.

- Improve detection of Electric version — make it more lenient.

- Add dependency on the `dash` package.

- Breaking change: Change the extension mechanism.

  - (Note that the extension mechanism is alpha and subject to change.)

  - Change `:client`, `:server` and `:neutral` to `nec/client`, `nec/server` and `nec/neutral`.

  - Allow each term in a parser spec to specify a site, and remove the `apply-to` option.

  - Other changes that move knowledge away from the generic code and into the parser specs.

  - Change `:shape` to `:terms`.

  - Add `:ecase`, `:list` and `:+`.


## Version 0.4 — 2025-03-18

- Don't color Electric calls.

- Don't color bound symbols when used in certain contexts:
  - as an arg in an Electric call
  - as the RHS of a binding pair.

- Provide an extension mechanism so that you can teach the mode about user-land binding macros.

- Support destructuring in `let-bindings` forms and `fn-bindings` forms.

- Understand that functions can have doc strings and attr-maps.

- Understand that an `e/fn` can have a name.

- Add dependency on the `parseclj` package.


## Version 0.3 — 2025-03-12

- Add `nomis/ec-use-underline?`.
- Add `M-x nomis/ec-cycle-options` to cycle through combinations of `nomis/ec-color-initial-whitespace?` and `nomis/ec-use-underline?`.


## Version 0.2 — 2025-03-10

- Add `e/for` in v3.
- Add `e/for-by` in v3.
- Allow whitespace after the parenthesis when looking for operators.
  - For example, `( e/client ...)`.


## Version 0.1 – 2025-03-09

Initial version.
