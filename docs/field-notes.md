# Field Notes

`zenith-svc-billing-mesh` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stale` is the strongest case at 208 on `queue pressure`. `baseline` is the cautious anchor at 177 on `queue pressure`.

The language-specific addition keeps the review model in a JVM-friendly data class.
