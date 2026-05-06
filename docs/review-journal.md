# Review Journal

I treated `zenith-svc-billing-mesh` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 177, lane `ship`
- `stress`: `retry load`, score 203, lane `ship`
- `edge`: `worker slack`, score 200, lane `ship`
- `recovery`: `session drift`, score 184, lane `ship`
- `stale`: `queue pressure`, score 208, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
