public class CollegeBoy {
    
    private int no;
    private String name;
    private String departmentName;
    private String cellphone;
    private String gender;

    private CollegeBoy(Builder builder)
    {
        this.no = builder.no;
        this.name = builder.name;
        this.departmentName = builder.departmentName;
        this.cellphone = builder.cellphone;
        this.gender =builder.gender;
    }

    public static class Builder{
        private int no;
        private String name;
        private String departmentName;
        private String cellphone;
        private String gender;

        public Builder no(int no)
        {
            this.no = no;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder departmentName(String departmentName)
        {
            this.departmentName = departmentName;
            return this;
        }
        public Builder cellphone(String cellphone)
        {
            this.cellphone = cellphone;
            return this;
        }
        public Builder gender(String gender)
        {
            this.gender = gender;
            return this;
        }
        
        public CollegeBoy build()
        {
            return new CollegeBoy(this);
        }

    }
        
        
}

