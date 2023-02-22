# March Madness Bracket

## Database

This application is backed by a PostgreSQL database. On Red Hat-based systems (Red Hat Enterprise Linux, Alma, Fedora,
etc.), you can install PostgreSQL and create the required database using the following commands:

    sudo dnf install postgresql-server postgresql-contrib
    sudo /usr/bin/postgresql-setup --initdb
    sudo systemctl enable postgresql
    sudo systemctl start postgresql
    sudo -u postgres createuser --createdb --createrole "$(whoami)"
    createdb march-madness

