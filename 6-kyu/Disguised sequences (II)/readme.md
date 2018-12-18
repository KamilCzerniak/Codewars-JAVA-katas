### Disguised sequences (II)

Let us define two sums `u(n, p)` and `v(n, p)`:

![](http://latex.codecogs.com/gif.latex?\bg_green&space;\large&space;u(n,&space;p)&space;=&space;\sum_{k=0}^{n}{(-1)^k}*p*{4^{n-k}}*\binom{2n-k+1}{k})

![](http://latex.codecogs.com/gif.latex?\bg_green&space;\large&space;v(n,&space;p)&space;=&space;\sum_{k=0}^{n}{(-1)^k}*p*{4^{n-k}}*\binom{2n-k}{k})

**Task:**
* **1)** Calculate `u(n, p)` and `v(n, p)` with two brute-force functions `u1(n, p)` and `v1(n, p)`.
* **2)** Try `u1(n, p)` and `v1(n, p)` for small values of `n` and `p` and guess the results of `u(n, p)` and `v(n, p)`
* **3)** Using 2) write `u_eff(n, p)` and `v_eff(n, p)` (or `uEff(n, p)` and `vEff(n, p)` or `u-eff(n, p)` and `v-eff(n, p))` to efficiently calculate `u` and `v` for bigger values of `n` and `p`

(This third part is not tested in

JS, CS, TS, C++, C, PHP, Crystal, Rust, Swift, R, Nim, Fortran, NASM

since there you don't have big integers to control your guess in part 2. See note below for "Shell").

**Examples:**
```
v1(12, 70) --> 1750
u1(13, 18) --> 252
```
**Extra points:**  

For the mathy ones: find a relation between `v(n, p)`, `v(n-1, p)` and `u(n-1, p)` :-)

**Notes**  
* Shell: only `v1(n, p)` is tested (use the solution you find for `v_eff(n, p)`.
* You could see: https://en.wikipedia.org/wiki/Binomial_coefficient for a refresh about `binomial coefficients`.

The link to this [kata](https://www.codewars.com/kata/disguised-sequences-ii/java)