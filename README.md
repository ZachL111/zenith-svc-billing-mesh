# zenith-svc-billing-mesh

`zenith-svc-billing-mesh` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for billing systems, covering storage recovery, log and snapshot fixtures, and failure-oriented tests.

## Use Case

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Zenith Svc Billing Mesh Review Notes

`stale` and `baseline` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/zenith-svc-billing-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin code keeps the review rule close to the tests.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The same command runs the local verification path. The highest-scoring domain case is `stale` at 208, which lands in `ship`. The most cautious case is `baseline` at 177, which lands in `ship`.

## Future Work

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
