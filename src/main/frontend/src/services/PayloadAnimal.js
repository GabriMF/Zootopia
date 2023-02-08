class Animal {
  #name;
  #date;
  #country;
  #type;
  #genre;
  #family;

  contructor(name, date, country, type, genre, family) {
    this.name = name;
    this.date = date;
    this.country = country;
    this.type = type;
    this.genre = genre;
    this.family = family;
  }

  get name() {
    return this.#name;
  }

  set name(name) {
    this.#name = name;
  }

  get date() {
    return this.#date;
  }

  set date(date) {
    this.#date = date;
  }

  get country() {
    return this.#name;
  }

  set country(country) {
    this.#country = country;
  }


  get genre() {
    return this.#genre;
  }

  set genre(genre) {
    this.#genre = genre;
  }

  get type() {
    return this.#type;
  }

  set type(type) {
    this.#type = type;
  }

  get family() {
    return this.#family;
  }

  set family(family) {
    this.#family = this.#family;
  }
}

export default Animal();
