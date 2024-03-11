export class Issue {
    _id: string;
    title: string;
    description : string;

    constructor(_id:string,title:string,description:string)
    {
        this._id = _id;
        this.description = description;
        this.title = title;
    }

    getId()
    {
        return this._id;
    }

    getDescription()
    {
        return this.description;
    }

    getTitle()
    {
        return this.title;
    }
    
   }
