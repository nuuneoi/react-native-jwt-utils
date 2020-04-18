
Pod::Spec.new do |s|
  s.name         = "JwtUtils"
  s.version      = "1.0.0"
  s.summary      = "JwtUtils"
  s.description  = <<-DESC
                  JwtUtils
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "sittiphol@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/codeforpublic/jwt-utils.git", :tag => "master" }
  s.source_files  = "RNJwtUtils/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  