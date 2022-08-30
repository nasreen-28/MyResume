export interface Resume {
    name: String;
    jobTitle: String;
    contact: {
      email: String;
      location: String;
      github: String;
      mobile: String;
      linkedin: String;
      stackoverflow: String;
    };
  
    ug: {
      degree: String;
      institute: String;
      startdate: String;
      enddate: String;
      cgpa: String;
      course: String;
    };
    hsc: {
      degree: String;
      institute: String;
      startdate: String;
      enddate: String;
      percentage: String;
    };
  
    projects:
    {
      title: String;
      desc1: String;
      desc2: String;
    }[];
    workexp: {
      company: String;
      designation: String;
      startdate: String;
      enddate: String;
      tasks: String;
    }[];
    achievements: {
      name: String;
      description: String;
    }[];
    participations: {
      name: String;
      description: String;
    }[];
    certifications: {
      name: String;
      date: String;
    }[];
    languages: {
      name: String;
      level: String;
    }[];
    areasofinterests: String[];
    skills: String[];
  
  }