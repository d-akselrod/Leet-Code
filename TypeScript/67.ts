function addBinary(a: string, b: string): string {
    let carry: string = "";
    let sum: string = "";
  
    for (let i: number = 0; i < Math.max(a.length, b.length); i++) {
      let nextBit: string;
  
      const bitA = a[a.length - 1 - i] || "0";
      const bitB = b[b.length - 1 - i] || "0";
  
      if (bitA === "1" && bitB === "1") {
        nextBit = carry === "1" ? "1" : "0";
        carry = "1";
      } else if (bitA === "0" && bitB === "0") {
        nextBit = carry === "1" ? "1" : "0";
        carry = "0";
      } else {
        nextBit = carry === "1" ? "0" : "1";
      }
  
      sum = nextBit + sum;
    }
  
    if (carry === "1") {
      sum = carry + sum;
    }
  
    return sum;
  }
  