image {
  resolution 600 400
  aa 1 2
  samples 2
  contrast 0.1
  filter mitchell
  jitter true
}

trace-depths {
  diff 1
  refl 4
  refr 4
}

camera {
  type pinhole
  eye -159.34600703211095 41.4280298959395 21.72986611946887
  target -1.0877250768482485 -1.2852382845018329 -1.0496354203128422
  up 0.24429591862011119 0.9681739828097193 -0.05439341096059712
  fov 52.5
  aspect 1.5
}

light {
  type sunsky
  up 0 1 0
  east 0 0 1
  sundir 1 1 1
  turbidity 6
  samples 64
}

}

light {
  type point
  color { "sRGB nonlinear" 1 1 1 }
  power 200 
  p 0 50 0
}

shader {
  name 33AC0AF9-4A18-4225-8140-338F2EE8913B
  type constant
  color { "sRGB nonlinear" 0.3215686274509804 0.6784313725490196 0.8 }
}

shader {
  name BA333541-E4AB-470F-9CC3-E456E3178C70
  type diffuse
  diff { "sRGB nonlinear" 0.6784313725490196 0.8509803921568627 0.5098039215686274 }
}

shader {
  name 54EE6324-9F3E-4BF6-8852-E69AE5AD2545
  type phong
  diff { "sRGB nonlinear" 0.9019607843137255 0.9490196078431372 0.7607843137254902 }
  spec { "sRGB nonlinear" 0.06666666666666667 0.06666666666666667 0.06666666666666667 } 30
  samples 4
}

shader {
  name 88A83DBB-83A2-4015-A2F1-20564D7DDFA9
  type phong
  diff { "sRGB nonlinear" 0.9450980392156862 0.8980392156862745 0.4235294117647059 }
  spec { "sRGB nonlinear" 0.06666666666666667 0.06666666666666667 0.06666666666666667 } 30
  samples 4
}

shader {
  name F20BEFC9-9A4E-475D-885B-713A1E6DD494
  type shiny
  diff { "sRGB nonlinear" 0.9529411764705882 0.47843137254901963 0.3803921568627451 }
  refl 0.5
}

shader {
  name 385AB3C3-7684-4D10-959D-4E9766036C2E
  type shiny
  diff { "sRGB nonlinear" 0.3215686274509804 0.6784313725490196 0.8 }
  refl 0.5
}

shader {
  name A868063E-7A07-4229-9C92-0ED807205050
  type glass
  eta 1
  color { "sRGB nonlinear" 0.6784313725490196 0.8509803921568627 0.5098039215686274 }
}

shader {
  name 8BB57F2E-A932-4F10-BAD0-C89AB0F4D865
  type glass
  eta 1
  color { "sRGB nonlinear" 0.9019607843137255 0.9490196078431372 0.7607843137254902 }
}

shader {
  name 559114F6-9E25-4DA4-9A19-0CA28DC295FC
  type mirror
  refl { "sRGB nonlinear" 1 1 1 }
}

shader {
  name E58310E9-C5F6-4636-8C30-2138F0EF6673
  type mirror
  refl { "sRGB nonlinear" 1 1 1 }
}

shader {
  name B0B044F5-6E3B-48DD-B90D-9F0A9DC1A01C
  type diffuse
  diff { "sRGB nonlinear" 1 1 1 }
}

shader {
  name 5514F9FB-DB46-425E-A651-0A780D3084F5
  type phong
  diff { "sRGB nonlinear" 0.43529411764705883 0.43529411764705883 0.43529411764705883 }
  spec { "sRGB nonlinear" 1 1 1 } 20
  samples 4
}

object {
  noinstance
  type generic-mesh
  name DC838E9D-8366-4D12-8D01-952EE11B1875
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
  name 56597471-DD12-4F9C-B9DA-01BD43B55A5C
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
  noinstance
  type generic-mesh
  name AAC76E18-754F-438A-8EAF-DBE49DA0F852
  points 273
    0 10.100000000000001 7.9
    0 5.5 18.900000000000002
    0 -8 -18.6
    0 8.8 -8.5
    -11 -6.6000000000000005 -7.9
    0.1 -5 32.800000000000004
    -2.5 -1.4000000000000001 42.6
    -9.5 -8.1 5.4
    0.5 0.2 91.4
    -6.4 -11.700000000000001 2.8000000000000003
    0.2 2.7 54.2
    0 -10.200000000000001 -12.200000000000001
    -7 -7 -14.8
    -11 7.2 6.2
    -2.7 -4.5 29
    0 -13.3 2.9000000000000004
    -2.3000000000000003 9.3 82.80000000000001
    0.2 -2.4000000000000004 55.1
    0.5 10.4 82.5
    0.6000000000000001 1 100.4
    0.30000000000000004 5.300000000000001 71.3
    -8.200000000000001 2.7 -19.700000000000003
    -8.200000000000001 -11.600000000000001 -13.200000000000001
    0.6000000000000001 -1.3 95.30000000000001
    0.6000000000000001 9.700000000000001 89.9
    0 3 23.1
    -12.9 -1.6 -10
    -2 1.5 71.9
    -5.5 -1.8 19.6
    -1.8 -1.6 97.4
    0 5.7 -18.1
    0.5 -9 97.9
    -1.8 1.3 42.300000000000004
    0 10.700000000000001 -1.7000000000000002
    0.4 1.8 81.9
    -9.3 6 13.3
    -6.6000000000000005 -5.300000000000001 -15.600000000000001
    0.1 1.9000000000000001 41.7
    0 -2.6 -26.6
    -2.4000000000000004 4.3 91.10000000000001
    -3.2 0.6000000000000001 28.5
    -3.1 -3.8000000000000003 -25.900000000000002
    -2.6 4 83.2
    -5.7 1.7000000000000002 19.5
    -2.4000000000000004 -1 55.300000000000004
    -6.4 -11.600000000000001 -15
    0.1 -3.6 42.5
    -2 7.7 90.9
    -4 5.7 -16
    -3.6 -0.7000000000000001 30.3
    -2.5 3.9000000000000004 71.5
    -13.700000000000001 -3.3000000000000003 -5.1000000000000005
    0.6000000000000001 4.800000000000001 97.4
    0.4 7 76.5
    -11.5 1.8 8.5
    -3 -2 35.4
    -3.4000000000000004 -7.300000000000001 -18.7
    0.1 -3.8000000000000003 36.2
    -2.4000000000000004 1.2000000000000002 55
    -6.300000000000001 8.200000000000001 -9.9
    -3 -6.800000000000001 -25.200000000000003
    -11.9 5.9 9.200000000000001
    0.5 -0.4 88.2
    -6.9 -8.4 -15.200000000000001
    -4 -6.9 -29
    0 -6.7 -28.3
    -8.5 9.700000000000001 -2.5
    -1.6 1.3 98.60000000000001
    0 2 27.200000000000003
    -6.5 -8.5 -34.5
    0 -7.2 24.700000000000003
    0 -5.6000000000000005 -36.4
    -5.6000000000000005 -10.200000000000001 -15.9
    -8.9 -9.700000000000001 -13.8
    -8 -16.900000000000002 -34.800000000000004
    -6.9 -16.8 -34.800000000000004
    -6.300000000000001 -15.8 -35.1
    -7.4 -15.200000000000001 -35.300000000000004
    -8.5 -15.8 -35.1
    -9.1 -27.700000000000003 -68.8
    -6.300000000000001 -27.8 -68.8
    -9.5 -24.1 -69.8
    -5.800000000000001 -24.3 -70
    -5.7 -17.5 -40.7
    -7.4 -15.5 -41.300000000000004
    -6.5 -18.8 -46.400000000000006
    -7.5 -18.2 -46.5
    -10 -17.400000000000002 -40.7
    -8.6 -19.6 -46.1
    -9.200000000000001 -19.700000000000003 -40.1
    -8.1 -20.3 -46
    -6.6000000000000005 -19.6 -40.1
    -7 -20.200000000000003 -46
    -6.7 -25.3 -67.60000000000001
    -7.5 -24.8 -67.7
    -8.3 -25.400000000000002 -67.60000000000001
    -8.1 -26.200000000000003 -67.3
    -7.1000000000000005 -26.1 -67.3
    -2.8000000000000003 3.8000000000000003 19.1
    -3.8000000000000003 -6.6000000000000005 -29.200000000000003
    -13 -39.800000000000004 20
    -21.200000000000003 -35 -5.9
    -16.900000000000002 -4.800000000000001 -2.2
    -25.5 -35.5 -10.8
    -10.200000000000001 -39.300000000000004 20.400000000000002
    -10.100000000000001 -0.5 10
    -18.900000000000002 -39.400000000000006 6.800000000000001
    -20.3 -23.900000000000002 3.5
    -15.8 -16.900000000000002 16
    -13 -16.6 17
    -12 -17.1 14.3
    -21.6 -22.1 -14.700000000000001
    -25 -35.7 -7.800000000000001
    -23.1 -20.6 -15.100000000000001
    -21.200000000000003 -19.8 -18.2
    -10.5 -39.6 21.700000000000003
    -21.900000000000002 -46.900000000000006 -6.4
    -21.5 -47.2 -7.800000000000001
    -6.4 -64.10000000000001 22.400000000000002
    -19.3 -54.1 -1.9000000000000001
    -3.6 -63.6 22.8
    -4 -63.800000000000004 24.1
    -15.8 -38.7 6
    -16.1 -53.400000000000006 -2.9000000000000004
    -4.800000000000001 -63.5 19.6
    -7.300000000000001 -64 20.5
    -10 -60.300000000000004 16.1
    -7.5 -59.7 15.100000000000001
    -11.9 -62.800000000000004 10.5
    -9.200000000000001 -62.2 9.200000000000001
    -14.600000000000001 -58.400000000000006 6.7
    -11.9 -57.7 5.1000000000000005
    -16.2 -58.7 2.6
    -13.200000000000001 -58.1 1.4000000000000001
    -6 -76.5 13.100000000000001
    -10.100000000000001 -72.10000000000001 5.6000000000000005
    -13.5 -66.9 0.5
    -16.3 -61.5 -3.3000000000000003
    -2.4000000000000004 -72.60000000000001 23.8
    -2.5 -78.4 20.3
    -13.600000000000001 0.4 2.7
    -16.2 -19.1 2.2
    12.4 -5.9 -8
    2.8000000000000003 -1.4000000000000001 42.6
    9.5 -5.6000000000000005 7.6000000000000005
    6.4 -11.700000000000001 2.8000000000000003
    7 -7 -14.8
    11.3 7.4 6.2
    2.8000000000000003 -4.5 29
    3.4000000000000004 9.3 82.80000000000001
    8.5 2.8000000000000003 -19.8
    7.9 -11.600000000000001 -13.200000000000001
    12.9 -1.6 -10
    2.8000000000000003 1.5 71.9
    5.5 -1.8 19.6
    3 -1.6 97.30000000000001
    2.2 1.3 42.300000000000004
    9.3 6 13.3
    6.6000000000000005 -5.300000000000001 -15.600000000000001
    3.6 4.3 91.10000000000001
    3.4000000000000004 0.6000000000000001 28.400000000000002
    3.1 -3.8000000000000003 -25.900000000000002
    3.7 4 83.10000000000001
    5.7 1.7000000000000002 19.5
    2.9000000000000004 -1 55.2
    6.2 -11.600000000000001 -15
    3.3000000000000003 7.6000000000000005 90.80000000000001
    4 5.7 -16
    3.7 -0.7000000000000001 30.3
    3.3000000000000003 3.9000000000000004 71.5
    13.700000000000001 -3.3000000000000003 -5.1000000000000005
    11.5 1.8 8.5
    3.3000000000000003 -2 35.4
    3.6 -7.2 -18.8
    2.9000000000000004 1.1 54.900000000000006
    6.300000000000001 8.200000000000001 -9.9
    3 -6.800000000000001 -25.200000000000003
    12.200000000000001 6.1000000000000005 9.200000000000001
    6.7 -8.4 -15.200000000000001
    4 -6.9 -29
    8.5 9.700000000000001 -2.5
    2.8000000000000003 1.2000000000000002 98.60000000000001
    6.5 -8.5 -34.5
    5.300000000000001 -10.200000000000001 -15.9
    8.700000000000001 -9.700000000000001 -13.700000000000001
    7.800000000000001 -16.900000000000002 -34.800000000000004
    6.7 -16.8 -34.800000000000004
    6.1000000000000005 -15.8 -35.1
    7.2 -15.200000000000001 -35.300000000000004
    8.3 -15.9 -35.1
    8.4 -27.5 -68.8
    6 -27.5 -68.8
    8.8 -24.3 -69.7
    5.6000000000000005 -24.5 -70
    5.5 -17.5 -40.7
    7.1000000000000005 -15.5 -41.300000000000004
    6.1000000000000005 -18.8 -46.400000000000006
    7.1000000000000005 -18.2 -46.5
    9.700000000000001 -17.400000000000002 -40.7
    8.200000000000001 -19.6 -46.1
    8.9 -19.700000000000003 -40.1
    7.7 -20.3 -46
    6.300000000000001 -19.6 -40.1
    6.6000000000000005 -20.200000000000003 -46
    6.4 -25.3 -67.60000000000001
    7.300000000000001 -24.8 -67.7
    8 -25.400000000000002 -67.60000000000001
    7.800000000000001 -26.200000000000003 -67.3
    6.800000000000001 -26.1 -67.3
    2.8000000000000003 3.8000000000000003 19.1
    3.8000000000000003 -6.6000000000000005 -29.200000000000003
    14.3 -39.2 19.400000000000002
    22.400000000000002 -34.2 -6.5
    17.8 -6.4 -0.4
    26.700000000000003 -34.7 -11.4
    11.5 -38.7 19.8
    10.9 -0.2 9.9
    20.1 -38.7 6.2
    21.700000000000003 -23.3 3.4000000000000004
    17.2 -16.2 15.9
    14.4 -16 16.900000000000002
    13.3 -16.5 14.3
    23 -21.3 -14.8
    26.3 -35 -8.4
    24.5 -19.900000000000002 -15.3
    22.6 -19 -18.3
    11.8 -38.900000000000006 21.1
    23.1 -46.2 -7.1000000000000005
    22.700000000000003 -46.400000000000006 -8.4
    7.7 -63.5 21.700000000000003
    20.5 -53.400000000000006 -2.6
    4.9 -63 22.1
    5.300000000000001 -63.2 23.400000000000002
    17 -38.1 5.4
    17.3 -52.7 -3.6
    6.1000000000000005 -62.900000000000006 18.900000000000002
    8.6 -63.400000000000006 19.8
    11.3 -59.6 15.4
    8.700000000000001 -59.1 14.4
    13.100000000000001 -62.2 9.8
    10.5 -61.6 8.5
    15.8 -57.7 6
    13.100000000000001 -57 4.4
    17.5 -58 1.9000000000000001
    14.5 -57.400000000000006 0.7000000000000001
    7.300000000000001 -75.9 12.3
    11.4 -71.4 4.9
    14.700000000000001 -66.2 -0.2
    17.6 -60.800000000000004 -4
    3.7 -72 23.1
    3.8000000000000003 -77.80000000000001 19.5
    13.9 0.5 2.7
    17.6 -18.400000000000002 2.1
    7.2 -27.200000000000003 -76.2
    -7.7 -27.200000000000003 -75.8
    4 5.800000000000001 90
    4.6000000000000005 6.5 84.4
    4.4 7.2 87.5
    4.5 3.9000000000000004 86.4
    4.3 5.4 86.9
    4.1000000000000005 6.1000000000000005 88.2
    3.8000000000000003 6.7 86
    4.7 8.3 85.60000000000001
    3.3000000000000003 6.4 87.10000000000001
    -3.3000000000000003 4 86.4
    -2.7 5.9 90.10000000000001
    -3.4000000000000004 6.5 84.5
    -3.6 8.4 85.60000000000001
    -2.1 6.4 87.10000000000001
    -2.9000000000000004 6.1000000000000005 88.30000000000001
    -3.1 5.5 87
    -2.7 6.800000000000001 86
    -3.2 7.300000000000001 87.5
  triangles 542
    0 35 1
    1 35 98
    60 36 41
    41 36 21
    38 41 30
    30 41 48
    43 54 28
    28 54 7
    59 3 48
    48 3 30
    21 36 26
    26 36 12
    59 66 3
    3 66 33
    15 70 9
    59 48 21
    21 48 41
    54 43 35
    35 43 98
    49 28 14
    49 40 43
    68 25 40
    40 25 43
    32 37 40
    40 37 68
    57 55 5
    5 55 49
    34 27 17
    17 27 44
    63 56 11
    2 11 56
    73 22 51
    51 22 7
    22 9 7
    7 9 28
    9 45 15
    58 50 10
    10 50 20
    12 36 63
    63 36 56
    9 70 28
    28 70 14
    49 14 5
    5 14 70
    72 63 11
    16 18 53
    46 6 57
    57 6 55
    47 24 18
    47 52 24
    42 266 16
    16 266 267
    270 264 269
    269 264 265
    47 265 67
    67 39 29
    1 98 25
    25 98 43
    51 140 26
    26 140 4
    42 53 50
    50 53 20
    50 27 42
    29 31 67
    8 23 39
    23 31 29
    58 10 32
    32 10 37
    40 49 32
    49 55 32
    55 6 32
    0 13 35
    35 13 61
    44 58 6
    6 58 32
    46 44 6
    23 29 39
    16 53 42
    50 58 27
    27 58 44
    22 45 9
    17 44 46
    54 140 7
    7 140 51
    19 52 67
    67 52 47
    67 31 19
    64 60 41
    56 60 2
    2 60 65
    62 42 34
    34 42 27
    71 41 38
    65 60 64
    22 74 45
    45 74 75
    76 72 75
    75 72 45
    76 77 72
    72 77 63
    77 78 63
    63 78 73
    78 74 73
    73 74 22
    85 86 83
    83 86 84
    88 87 86
    86 87 84
    90 89 88
    88 89 87
    92 91 90
    90 91 89
    85 83 92
    92 83 91
    78 87 74
    74 87 89
    89 91 74
    74 91 75
    91 83 75
    75 83 76
    84 77 83
    83 77 76
    87 78 84
    84 78 77
    93 94 85
    85 94 86
    95 88 94
    94 88 86
    95 96 88
    88 96 90
    96 97 90
    90 97 92
    97 93 92
    92 93 85
    81 79 95
    95 79 96
    80 97 79
    79 97 96
    82 93 80
    80 93 97
    82 81 94
    81 95 94
    42 62 264
    264 62 39
    39 62 8
    51 26 73
    63 73 12
    26 12 73
    21 26 4
    33 66 0
    0 66 13
    82 94 93
    72 11 45
    15 45 11
    99 71 69
    41 99 64
    71 99 41
    64 99 69
    69 71 64
    64 71 65
    54 35 105
    105 35 61
    107 106 100
    110 104 141
    141 104 122
    108 13 102
    102 13 66
    13 108 61
    61 108 109
    110 105 109
    109 105 61
    105 110 140
    140 110 141
    21 113 102
    102 113 107
    113 112 107
    107 112 106
    112 113 103
    103 113 114
    66 59 102
    102 59 21
    115 109 100
    100 109 108
    115 104 109
    109 104 110
    21 4 114
    114 4 111
    102 107 108
    108 107 100
    101 103 111
    111 103 114
    103 117 112
    112 117 116
    118 100 125
    126 125 100
    112 116 106
    106 116 119
    121 120 115
    115 120 104
    100 118 115
    115 118 121
    131 133 122
    133 123 122
    101 122 123
    117 123 116
    116 123 119
    129 134 128
    128 134 126
    126 134 127
    127 134 129
    131 135 130
    130 135 128
    128 135 129
    129 135 131
    133 136 132
    132 136 130
    130 136 131
    131 136 133
    123 137 119
    119 137 132
    132 137 133
    133 137 123
    124 138 125
    125 138 118
    118 138 121
    121 138 120
    120 138 124
    127 139 126
    126 139 125
    125 139 124
    124 139 127
    103 101 117
    117 101 123
    126 100 128
    130 128 100
    100 106 130
    130 106 132
    106 119 132
    21 114 113
    104 127 122
    127 129 122
    129 131 122
    120 124 104
    104 124 127
    140 54 105
    111 4 141
    141 4 140
    111 141 101
    101 141 122
    47 18 16
    0 1 157
    157 1 209
    150 158 161
    161 158 176
    38 30 161
    161 30 167
    163 154 171
    171 154 144
    175 167 3
    3 167 30
    146 158 152
    152 158 150
    33 180 3
    3 180 175
    173 176 158
    15 145 70
    161 167 150
    150 167 175
    209 163 157
    157 163 171
    148 154 168
    163 160 168
    163 25 160
    160 25 68
    68 37 160
    160 37 156
    168 172 5
    5 172 57
    164 153 17
    17 153 34
    178 11 173
    2 173 11
    184 170 151
    151 170 144
    154 145 144
    144 145 151
    145 15 165
    174 10 169
    169 10 20
    146 178 158
    158 178 173
    148 70 154
    154 70 145
    70 148 5
    5 148 168
    183 11 178
    149 53 18
    46 57 143
    143 57 172
    166 18 24
    166 24 52
    255 260 257
    166 262 149
    255 181 159
    159 181 155
    1 25 209
    209 25 163
    170 152 251
    251 152 142
    162 169 53
    53 169 20
    169 162 153
    155 181 31
    8 159 23
    23 155 31
    174 156 10
    10 156 37
    160 156 168
    168 156 172
    156 143 172
    0 157 147
    147 157 177
    164 143 174
    143 156 174
    46 143 164
    23 159 155
    71 38 161
    149 162 53
    164 174 153
    153 174 169
    151 145 165
    17 46 164
    170 251 144
    144 251 171
    166 52 181
    181 52 19
    181 19 31
    173 2 176
    176 2 65
    179 161 176
    153 162 34
    34 162 62
    65 179 176
    151 165 185
    185 165 186
    165 183 186
    186 183 187
    187 183 188
    188 183 178
    188 178 189
    189 178 184
    189 184 185
    185 184 151
    195 197 194
    194 197 196
    195 198 197
    197 198 199
    198 200 199
    199 200 201
    200 202 201
    201 202 203
    202 194 203
    203 194 196
    189 185 198
    198 185 200
    200 185 202
    202 185 186
    202 186 194
    194 186 187
    187 188 194
    194 188 195
    188 189 195
    195 189 198
    197 205 196
    196 205 204
    197 199 205
    205 199 206
    206 199 207
    207 199 201
    207 201 208
    208 201 203
    208 203 204
    204 203 196
    207 190 206
    206 190 192
    207 208 190
    190 208 191
    193 191 204
    204 191 208
    193 205 192
    192 205 206
    162 258 62
    62 258 159
    62 159 8
    170 184 152
    178 146 184
    184 146 152
    150 142 152
    33 0 180
    180 0 147
    193 204 205
    183 165 11
    15 11 165
    210 182 71
    161 179 210
    71 161 210
    179 182 210
    65 71 179
    179 71 182
    171 216 157
    157 216 177
    218 211 217
    233 215 252
    252 215 221
    219 213 147
    147 213 180
    220 219 177
    177 219 147
    177 216 220
    220 216 221
    216 251 221
    221 251 252
    218 224 213
    213 224 150
    224 218 223
    223 218 217
    225 224 214
    214 224 223
    180 213 175
    175 213 150
    219 220 211
    211 220 226
    221 215 220
    220 215 226
    222 142 225
    225 142 150
    211 218 219
    219 218 213
    212 222 214
    214 222 225
    214 223 228
    228 223 227
    229 236 211
    237 211 236
    230 227 217
    223 217 227
    215 231 226
    226 231 232
    211 226 229
    229 226 232
    242 233 244
    233 234 244
    212 234 233
    227 230 228
    228 230 234
    240 239 245
    239 237 245
    237 238 245
    238 240 245
    242 241 246
    241 239 246
    239 240 246
    240 242 246
    244 243 247
    243 241 247
    241 242 247
    242 244 247
    234 230 248
    230 243 248
    243 244 248
    244 234 248
    235 236 249
    236 229 249
    229 232 249
    232 231 249
    231 235 249
    238 237 250
    237 236 250
    236 235 250
    235 238 250
    234 212 228
    228 212 214
    241 217 211
    211 237 239
    241 211 239
    241 243 217
    217 243 230
    150 224 225
    215 233 238
    238 233 240
    233 242 240
    231 215 235
    215 238 235
    251 216 171
    251 142 252
    252 142 222
    233 252 212
    212 252 222
    166 149 18
    190 253 192
    191 193 253
    253 193 192
    191 253 190
    82 254 81
    80 79 254
    254 79 81
    80 254 82
    60 56 36
    168 154 163
    43 28 49
    257 262 166
    159 258 255
    258 162 256
    259 256 261
    260 263 257
    259 260 258
    258 260 255
    263 261 257
    262 256 149
    149 256 162
    260 259 263
    259 261 263
    257 261 262
    262 261 256
    258 256 259
    255 257 166
    265 272 269
    16 267 47
    272 267 271
    271 267 266
    266 264 270
    268 270 269
    271 270 268
    272 271 268
    269 272 268
    266 270 271
    266 42 264
    265 264 39
    47 272 265
    47 267 272
    67 265 39
    166 181 255
  normals none
  uvs none
}

object {
  shader 33AC0AF9-4A18-4225-8140-338F2EE8913B
  type sphere
  name 21FA431E-AC8B-4A3F-94B6-AD1728142EF4
  c 100 0 0
  r 20
}

object {
  shader BA333541-E4AB-470F-9CC3-E456E3178C70
  type sphere
  name 2BE5B9BA-B24A-4274-8357-1591F9F77272
  c 80.90170288085938 0 58.778526306152344
  r 20
}

object {
  shader 54EE6324-9F3E-4BF6-8852-E69AE5AD2545
  type sphere
  name 68DC0145-1FD8-453D-99CE-3CE79D936BCD
  c 30.90169906616211 0 95.10565185546875
  r 20
}

object {
  shader 88A83DBB-83A2-4015-A2F1-20564D7DDFA9
  type sphere
  name 762DB5D6-9814-4EBE-A6EF-9A6738982372
  c -30.90169906616211 0 95.10565185546875
  r 20
}

object {
  shader F20BEFC9-9A4E-475D-885B-713A1E6DD494
  type sphere
  name C7855436-9C6D-4F89-B169-B5A0FEA995EF
  c -80.90170288085938 0 58.778526306152344
  r 20
}

object {
  shader 385AB3C3-7684-4D10-959D-4E9766036C2E
  type sphere
  name A50D5B1C-EB46-4984-A010-3F883FF3D85D
  c -100 0 1.2246063538223773e-14
  r 20
}

object {
  shader A868063E-7A07-4229-9C92-0ED807205050
  type sphere
  name 5BB4854B-569F-4C6F-AFB3-A31CF1F02E7B
  c -80.90170288085938 0 -58.778526306152344
  r 20
}

object {
  shader 8BB57F2E-A932-4F10-BAD0-C89AB0F4D865
  type sphere
  name DF9C15D5-E94A-4535-9489-6EEB7C25804A
  c -30.90169906616211 0 -95.10565185546875
  r 20
}

object {
  shader 559114F6-9E25-4DA4-9A19-0CA28DC295FC
  type sphere
  name 10D62D36-B921-4EE5-9ECD-54ED0933C6F6
  c 30.90169906616211 0 -95.10565185546875
  r 20
}

object {
  shader E58310E9-C5F6-4636-8C30-2138F0EF6673
  type sphere
  name F11532CD-19D5-4997-99CD-135AB7A2DCAC
  c 80.90170288085938 0 -58.778526306152344
  r 20
}

instance {
  name CCED6CD2-FD6F-400B-A5AF-0E3942956782
  geometry 56597471-DD12-4F9C-B9DA-01BD43B55A5C
  transform col 1 0 0 0 0 2.220446049250313e-16 1 0 0 -1 2.220446049250313e-16 0 0 -20 0 1
  shader B0B044F5-6E3B-48DD-B90D-9F0A9DC1A01C
}

instance {
  name A54B224D-1EB3-4FD0-8181-BCC1558445AC
  geometry AAC76E18-754F-438A-8EAF-DBE49DA0F852
  transform col 0.1891057938337326 0 0.29451483488082886 0 0 0.3499999940395355 0 0 -0.29451483488082886 0 0.1891057938337326 0 0 15 0 1
  shader 5514F9FB-DB46-425E-A651-0A780D3084F5
}

