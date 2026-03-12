const defaults = { theme: 'dark', lang: 'en', font: 'mono' };
const userPrefs = { lang: 'hi', fontSize: 14 };

// Merge (later keys win)
const config = { ...defaults, ...userPrefs };
console.log(config);

// Clone object (shallow)
const clone = { ...defaults };
console.log(clone);