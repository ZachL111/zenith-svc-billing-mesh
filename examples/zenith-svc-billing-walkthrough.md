# Zenith Svc Billing Mesh Walkthrough

This note is the quickest way to read the extra review model in `zenith-svc-billing-mesh`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 177 | ship |
| stress | retry load | 203 | ship |
| edge | worker slack | 200 | ship |
| recovery | session drift | 184 | ship |
| stale | queue pressure | 208 | ship |

Start with `stale` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`stale` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
