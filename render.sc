image {
  resolution 800 800
  aa -1 1
  samples 2
  contrast 0.1
  filter box
  jitter true
}

trace-depths{
  diff 1
  refl 4
  refr 4
}

camera {
  type pinhole
  eye 132.68727202253666 -3.189597574714774 486.70465044644783
  target 0.00655336180493632 0.2661502872119656 0.15754504780891704
  up -0.15136998189658646 0.9873237893987025 0.047737443040194005
  fov 35
  aspect 1
}

light {
  type sunsky
  up 0 1 0
  east 0 0 1
  sundir 1 1 1
  turbidity 6
  samples 64
}

shader {
  name 6FC3A8DC-9F16-467C-BE4C-2998BA7592BC
  type diffuse
  diff { "sRGB nonlinear" 0.3215686274509804 0.6784313725490196 0.8 }
}

shader {
  name F4425EF9-6B6D-4DA6-8C35-4EED74202E7F
  type diffuse
  diff { "sRGB nonlinear" 0.6784313725490196 0.8509803921568627 0.5098039215686274 }
}

shader {
  name FB04E518-DFCE-4065-8DB2-8882942C1094
  type diffuse
  diff { "sRGB nonlinear" 0.9019607843137255 0.9490196078431372 0.7607843137254902 }
}

shader {
  name 29D25CD3-FD47-4F60-BD63-296C47A4F402
  type diffuse
  diff { "sRGB nonlinear" 0.9450980392156862 0.8980392156862745 0.4235294117647059 }
}

shader {
  name A04A3833-AF32-47AB-96BA-1A380290024B
  type diffuse
  diff { "sRGB nonlinear" 0.9529411764705882 0.47843137254901963 0.3803921568627451 }
}

shader {
  name A853AC62-185E-458E-9C45-05573EB17973
  type diffuse
  diff { "sRGB nonlinear" 1 1 1 }
}

object {
  noinstance
  type generic-mesh
  name 5F3EFB52-0F6E-43F6-B4EE-13342CEF04BD
  points 63
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    0 20 0
    -9.999999999999998 17.320508075688775 0
    -7.071067811865475 17.320508075688775 7.071067811865474
    -6.123031769111885e-16 17.320508075688775 9.999999999999998
    7.071067811865474 17.320508075688775 7.071067811865475
    9.999999999999998 17.320508075688775 1.224606353822377e-15
    7.071067811865476 17.320508075688775 -7.071067811865474
    1.8369095307335655e-15 17.320508075688775 -9.999999999999998
    -7.071067811865473 17.320508075688775 -7.071067811865476
    -9.999999999999998 17.320508075688775 -2.449212707644754e-15
    -17.32050807568877 10.000000000000002 0
    -12.24744871391589 10.000000000000002 12.247448713915889
    -1.0605402120460133e-15 10.000000000000002 17.32050807568877
    12.247448713915889 10.000000000000002 12.24744871391589
    17.32050807568877 10.000000000000002 2.1210804240920267e-15
    12.247448713915894 10.000000000000002 -12.247448713915889
    3.18162063613804e-15 10.000000000000002 -17.32050807568877
    -12.247448713915887 10.000000000000002 -12.247448713915894
    -17.32050807568877 10.000000000000002 -4.242160848184053e-15
    -20 1.2246063538223773e-15 0
    -14.142135623730951 1.2246063538223773e-15 14.14213562373095
    -1.2246063538223773e-15 1.2246063538223773e-15 20
    14.14213562373095 1.2246063538223773e-15 14.142135623730951
    20 1.2246063538223773e-15 2.4492127076447545e-15
    14.142135623730955 1.2246063538223773e-15 -14.14213562373095
    3.673819061467132e-15 1.2246063538223773e-15 -20
    -14.142135623730947 1.2246063538223773e-15 -14.142135623730955
    -20 1.2246063538223773e-15 -4.898425415289509e-15
    -17.320508075688775 -9.999999999999996 0
    -12.247448713915892 -9.999999999999996 12.24744871391589
    -1.0605402120460135e-15 -9.999999999999996 17.320508075688775
    12.24744871391589 -9.999999999999996 12.247448713915892
    17.320508075688775 -9.999999999999996 2.121080424092027e-15
    12.247448713915896 -9.999999999999996 -12.24744871391589
    3.1816206361380404e-15 -9.999999999999996 -17.320508075688775
    -12.247448713915889 -9.999999999999996 -12.247448713915896
    -17.320508075688775 -9.999999999999996 -4.242160848184054e-15
    -9.999999999999998 -17.320508075688775 0
    -7.071067811865475 -17.320508075688775 7.071067811865474
    -6.123031769111885e-16 -17.320508075688775 9.999999999999998
    7.071067811865474 -17.320508075688775 7.071067811865475
    9.999999999999998 -17.320508075688775 1.224606353822377e-15
    7.071067811865476 -17.320508075688775 -7.071067811865474
    1.8369095307335655e-15 -17.320508075688775 -9.999999999999998
    -7.071067811865473 -17.320508075688775 -7.071067811865476
    -9.999999999999998 -17.320508075688775 -2.449212707644754e-15
    -2.4492127076447545e-15 -20 0
    -1.7318549141438712e-15 -20 1.7318549141438708e-15
    -1.4996607218221374e-31 -20 2.4492127076447545e-15
    1.7318549141438708e-15 -20 1.7318549141438712e-15
    2.4492127076447545e-15 -20 2.999321443644275e-31
    1.7318549141438716e-15 -20 -1.7318549141438708e-15
    4.498982165466412e-31 -20 -2.4492127076447545e-15
    -1.7318549141438706e-15 -20 -1.7318549141438716e-15
    -2.4492127076447545e-15 -20 -5.99864288728855e-31
  triangles 80
    1 9 10
    2 10 11
    3 11 12
    4 12 13
    5 13 14
    6 14 15
    7 15 16
    8 16 17
    10 9 19
    9 18 19
    11 10 20
    10 19 20
    12 11 21
    11 20 21
    13 12 22
    12 21 22
    14 13 23
    13 22 23
    15 14 24
    14 23 24
    16 15 25
    15 24 25
    17 16 26
    16 25 26
    19 18 28
    18 27 28
    20 19 29
    19 28 29
    21 20 30
    20 29 30
    22 21 31
    21 30 31
    23 22 32
    22 31 32
    24 23 33
    23 32 33
    25 24 34
    24 33 34
    26 25 35
    25 34 35
    28 27 37
    27 36 37
    29 28 38
    28 37 38
    30 29 39
    29 38 39
    31 30 40
    30 39 40
    32 31 41
    31 40 41
    33 32 42
    32 41 42
    34 33 43
    33 42 43
    35 34 44
    34 43 44
    37 36 46
    36 45 46
    38 37 47
    37 46 47
    39 38 48
    38 47 48
    40 39 49
    39 48 49
    41 40 50
    40 49 50
    42 41 51
    41 50 51
    43 42 52
    42 51 52
    44 43 53
    43 52 53
    46 45 54
    47 46 55
    48 47 56
    49 48 57
    50 49 58
    51 50 59
    52 51 60
    53 52 61
  normals none
  uvs none
}

object {
  noinstance
  type generic-mesh
  name F395F172-9453-4B53-9363-474ED0A89745
  points 36
    -500000 500000 0
    -300000 500000 0
    -100000 500000 0
    100000 500000 0
    300000 500000 0
    500000 500000 0
    -500000 300000 0
    -300000 300000 0
    -100000 300000 0
    100000 300000 0
    300000 300000 0
    500000 300000 0
    -500000 100000 0
    -300000 100000 0
    -100000 100000 0
    100000 100000 0
    300000 100000 0
    500000 100000 0
    -500000 -100000 0
    -300000 -100000 0
    -100000 -100000 0
    100000 -100000 0
    300000 -100000 0
    500000 -100000 0
    -500000 -300000 0
    -300000 -300000 0
    -100000 -300000 0
    100000 -300000 0
    300000 -300000 0
    500000 -300000 0
    -500000 -500000 0
    -300000 -500000 0
    -100000 -500000 0
    100000 -500000 0
    300000 -500000 0
    500000 -500000 0
  triangles 50
    0 6 1
    6 7 1
    1 7 2
    7 8 2
    2 8 3
    8 9 3
    3 9 4
    9 10 4
    4 10 5
    10 11 5
    6 12 7
    12 13 7
    7 13 8
    13 14 8
    8 14 9
    14 15 9
    9 15 10
    15 16 10
    10 16 11
    16 17 11
    12 18 13
    18 19 13
    13 19 14
    19 20 14
    14 20 15
    20 21 15
    15 21 16
    21 22 16
    16 22 17
    22 23 17
    18 24 19
    24 25 19
    19 25 20
    25 26 20
    20 26 21
    26 27 21
    21 27 22
    27 28 22
    22 28 23
    28 29 23
    24 30 25
    30 31 25
    25 31 26
    31 32 26
    26 32 27
    32 33 27
    27 33 28
    33 34 28
    28 34 29
    34 35 29
  normals none
  uvs none
}

object {
  shader 6FC3A8DC-9F16-467C-BE4C-2998BA7592BC
  type sphere
  name 06DA4801-ACA0-43C1-99AA-E8D577241803
  c -100 0 0
  r 20
}

object {
  shader F4425EF9-6B6D-4DA6-8C35-4EED74202E7F
  type sphere
  name EA553814-499C-406D-9765-E0F89B517CFC
  c -50 0 0
  r 20
}

object {
  shader FB04E518-DFCE-4065-8DB2-8882942C1094
  type sphere
  name 2A8819C7-8F57-4A3B-B864-595D81B5E859
  c 0 0 0
  r 20
}

object {
  shader 29D25CD3-FD47-4F60-BD63-296C47A4F402
  type sphere
  name 8B46F2BE-A8B3-4211-8224-3D5CA4B8BC1B
  c 50 0 0
  r 20
}

object {
  shader A04A3833-AF32-47AB-96BA-1A380290024B
  type sphere
  name BEB18190-3F20-42A7-8C2C-4D7D11FBE346
  c 100 0 0
  r 20
}

instance {
  name CB2BABB8-330B-4787-A5F8-21212DC7C6FC
  geometry F395F172-9453-4B53-9363-474ED0A89745
  transform col 1 0 0 0 0 2.220446049250313e-16 1 0 0 -1 2.220446049250313e-16 0 0 -20 0 1
  shader A853AC62-185E-458E-9C45-05573EB17973
}

