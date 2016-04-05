# clear previous backup
rm -rf "$(git rev-parse --git-dir)/refs/original/"

commit="1b99699ddc301e8180d9b25a0e3a99d21fff8897"
date=$(date -d '1 day ago')
git filter-branch --env-filter \
    "if [ \$GIT_COMMIT = '$commit' ]; then
         export GIT_AUTHOR_DATE='$date'
         export GIT_COMMITTER_DATE='$date'
         export GIT_COMMITTER_NAME="\$GIT_AUTHOR_NAME"
         export GIT_COMMITTER_EMAIL="\$GIT_AUTHOR_EMAIL"
     fi"