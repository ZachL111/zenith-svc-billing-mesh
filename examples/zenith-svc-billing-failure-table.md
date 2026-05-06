# Zenith Svc Billing Mesh Failure Table

| Case | Focus | Expected Lane |
| --- | --- | --- |
| g001 | queue pressure | hold |
| g002 | retry load | hold |
| g003 | worker slack | hold |
| g004 | session drift | hold |
| g005 | queue pressure | watch |
| g006 | retry load | hold |
| g007 | worker slack | hold |
| g008 | session drift | ship |
| g009 | queue pressure | hold |
| g010 | retry load | watch |
| g011 | worker slack | ship |
| g012 | session drift | ship |

Use this table when a verifier failure is hard to read from the raw CSV.
