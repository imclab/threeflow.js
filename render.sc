image {
  resolution 1177 477
  aa -1 1
  samples 2
  contrast 0.1
  filter box
  jitter true
}

trace-depths {
  diff 1
  refl 4
  refr 4
}

camera {
  type pinhole
  eye -1331.1274683664058 919.8439905898726 -488.3873536446305
  target -2.0588930331878426 -0.9068870427089923 -2.53763096504459
  up -0.30946126769512905 0.9371134401082613 0.1614067042132498
  fov 86.36268343815513
  aspect 2.4675052410901466
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

}

shader {
  name 70CAEA78-7B76-4CB9-A73A-9A6FF6894ADA
  type diffuse
  diff { "sRGB nonlinear" 0.3215686274509804 0.6784313725490196 0.8 }
}

shader {
  name 51EF3EF7-D828-4C14-A1B7-3C9373A07D25
  type diffuse
  diff { "sRGB nonlinear" 0.6784313725490196 0.8509803921568627 0.5098039215686274 }
}

shader {
  name B61885EB-70E1-4D67-9D3D-167740C05B23
  type diffuse
  diff { "sRGB nonlinear" 0.9019607843137255 0.9490196078431372 0.7607843137254902 }
}

shader {
  name C2CAFB9D-9572-4149-B9AC-E3D05CF17581
  type diffuse
  diff { "sRGB nonlinear" 0.9450980392156862 0.8980392156862745 0.4235294117647059 }
}

shader {
  name 232167D9-2E42-43A1-A8CE-2BE8B03AA5D9
  type diffuse
  diff { "sRGB nonlinear" 0.9529411764705882 0.47843137254901963 0.3803921568627451 }
}

shader {
  name 0733E7A0-6DEC-461A-8430-B4584DA09073
  type diffuse
  diff { "sRGB nonlinear" 0.3215686274509804 0.6784313725490196 0.8 }
}

shader {
  name 140175B7-5E84-4914-A0E3-9FBB511DA6C9
  type diffuse
  diff { "sRGB nonlinear" 0.6784313725490196 0.8509803921568627 0.5098039215686274 }
}

shader {
  name C920CCB1-7D82-4F97-BD72-F20522931611
  type diffuse
  diff { "sRGB nonlinear" 0.9019607843137255 0.9490196078431372 0.7607843137254902 }
}

shader {
  name AC550690-4868-4ED5-8626-9855F3B62555
  type mirror
  refl { "sRGB nonlinear" 0.9372549019607843 0.9372549019607843 1 }
}

object {
  noinstance
  type generic-mesh
  name 8EBCBEFC-C661-43DA-A4B9-F3DE035B1CF8
  points 63
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    0 98 0
    -48.99999999999999 84.870489570875 0
    -34.648232278140824 84.870489570875 34.64823227814082
    -3.000285566864824e-15 84.870489570875 48.99999999999999
    34.64823227814082 84.870489570875 34.648232278140824
    48.99999999999999 84.870489570875 6.000571133729648e-15
    34.64823227814083 84.870489570875 -34.64823227814082
    9.000856700594471e-15 84.870489570875 -48.99999999999999
    -34.64823227814081 84.870489570875 -34.64823227814083
    -48.99999999999999 84.870489570875 -1.2001142267459296e-14
    -84.87048957087498 49.000000000000014 0
    -60.01249869818786 49.000000000000014 60.012498698187855
    -5.196647039025465e-15 49.000000000000014 84.87048957087498
    60.012498698187855 49.000000000000014 60.01249869818786
    84.87048957087498 49.000000000000014 1.039329407805093e-14
    60.012498698187876 49.000000000000014 -60.012498698187855
    1.5589941117076397e-14 49.000000000000014 -84.87048957087498
    -60.01249869818784 49.000000000000014 -60.012498698187876
    -84.87048957087498 49.000000000000014 -2.078658815610186e-14
    -98 6.0005711337296486e-15 0
    -69.29646455628166 6.0005711337296486e-15 69.29646455628165
    -6.0005711337296486e-15 6.0005711337296486e-15 98
    69.29646455628165 6.0005711337296486e-15 69.29646455628166
    98 6.0005711337296486e-15 1.2001142267459297e-14
    69.29646455628168 6.0005711337296486e-15 -69.29646455628165
    1.8001713401188946e-14 6.0005711337296486e-15 -98
    -69.29646455628163 6.0005711337296486e-15 -69.29646455628168
    -98 6.0005711337296486e-15 -2.4002284534918594e-14
    -84.870489570875 -48.99999999999998 0
    -60.01249869818787 -48.99999999999998 60.01249869818786
    -5.196647039025466e-15 -48.99999999999998 84.870489570875
    60.01249869818786 -48.99999999999998 60.01249869818787
    84.870489570875 -48.99999999999998 1.0393294078050932e-14
    60.01249869818788 -48.99999999999998 -60.01249869818786
    1.5589941117076397e-14 -48.99999999999998 -84.870489570875
    -60.01249869818785 -48.99999999999998 -60.01249869818788
    -84.870489570875 -48.99999999999998 -2.0786588156101864e-14
    -48.99999999999999 -84.870489570875 0
    -34.648232278140824 -84.870489570875 34.64823227814082
    -3.000285566864824e-15 -84.870489570875 48.99999999999999
    34.64823227814082 -84.870489570875 34.648232278140824
    48.99999999999999 -84.870489570875 6.000571133729648e-15
    34.64823227814083 -84.870489570875 -34.64823227814082
    9.000856700594471e-15 -84.870489570875 -48.99999999999999
    -34.64823227814081 -84.870489570875 -34.64823227814083
    -48.99999999999999 -84.870489570875 -1.2001142267459296e-14
    -1.2001142267459297e-14 -98 0
    -8.486089079304969e-15 -98 8.486089079304967e-15
    -7.3483375369284735e-31 -98 1.2001142267459297e-14
    8.486089079304967e-15 -98 8.486089079304969e-15
    1.2001142267459297e-14 -98 1.4696675073856947e-30
    8.48608907930497e-15 -98 -8.486089079304967e-15
    2.204501261078542e-30 -98 -1.2001142267459297e-14
    -8.486089079304965e-15 -98 -8.48608907930497e-15
    -1.2001142267459297e-14 -98 -2.9393350147713894e-30
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
  name F37AC8D5-5BE3-4C94-BE71-F438CC47B2CB
  points 63
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    0 250 0
    -124.99999999999999 216.50635094610968 0
    -88.38834764831843 216.50635094610968 88.38834764831842
    -7.653789711389856e-15 216.50635094610968 124.99999999999999
    88.38834764831842 216.50635094610968 88.38834764831843
    124.99999999999999 216.50635094610968 1.5307579422779713e-14
    88.38834764831844 216.50635094610968 -88.38834764831842
    2.296136913416957e-14 216.50635094610968 -124.99999999999999
    -88.3883476483184 216.50635094610968 -88.38834764831844
    -124.99999999999999 216.50635094610968 -3.0615158845559425e-14
    -216.50635094610965 125.00000000000003 0
    -153.09310892394862 125.00000000000003 153.0931089239486
    -1.3256752650575167e-14 125.00000000000003 216.50635094610965
    153.0931089239486 125.00000000000003 153.09310892394862
    216.50635094610965 125.00000000000003 2.6513505301150335e-14
    153.09310892394865 125.00000000000003 -153.0931089239486
    3.97702579517255e-14 125.00000000000003 -216.50635094610965
    -153.0931089239486 125.00000000000003 -153.09310892394865
    -216.50635094610965 125.00000000000003 -5.302701060230067e-14
    -250 1.5307579422779716e-14 0
    -176.7766952966369 1.5307579422779716e-14 176.77669529663686
    -1.5307579422779716e-14 1.5307579422779716e-14 250
    176.77669529663686 1.5307579422779716e-14 176.7766952966369
    250 1.5307579422779716e-14 3.061515884555943e-14
    176.77669529663692 1.5307579422779716e-14 -176.77669529663686
    4.592273826833915e-14 1.5307579422779716e-14 -250
    -176.77669529663683 1.5307579422779716e-14 -176.77669529663692
    -250 1.5307579422779716e-14 -6.123031769111886e-14
    -216.50635094610968 -124.99999999999994 0
    -153.09310892394865 -124.99999999999994 153.09310892394862
    -1.3256752650575169e-14 -124.99999999999994 216.50635094610968
    153.09310892394862 -124.99999999999994 153.09310892394865
    216.50635094610968 -124.99999999999994 2.6513505301150338e-14
    153.09310892394868 -124.99999999999994 -153.09310892394862
    3.977025795172551e-14 -124.99999999999994 -216.50635094610968
    -153.0931089239486 -124.99999999999994 -153.09310892394868
    -216.50635094610968 -124.99999999999994 -5.3027010602300676e-14
    -124.99999999999999 -216.50635094610968 0
    -88.38834764831843 -216.50635094610968 88.38834764831842
    -7.653789711389856e-15 -216.50635094610968 124.99999999999999
    88.38834764831842 -216.50635094610968 88.38834764831843
    124.99999999999999 -216.50635094610968 1.5307579422779713e-14
    88.38834764831844 -216.50635094610968 -88.38834764831842
    2.296136913416957e-14 -216.50635094610968 -124.99999999999999
    -88.3883476483184 -216.50635094610968 -88.38834764831844
    -124.99999999999999 -216.50635094610968 -3.0615158845559425e-14
    -3.061515884555943e-14 -250 0
    -2.164818642679839e-14 -250 2.1648186426798384e-14
    -1.8745759022776718e-30 -250 3.061515884555943e-14
    2.1648186426798384e-14 -250 2.164818642679839e-14
    3.061515884555943e-14 -250 3.7491518045553436e-30
    2.1648186426798393e-14 -250 -2.1648186426798384e-14
    5.6237277068330154e-30 -250 -3.061515884555943e-14
    -2.164818642679838e-14 -250 -2.1648186426798393e-14
    -3.061515884555943e-14 -250 -7.498303609110687e-30
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
  shader 70CAEA78-7B76-4CB9-A73A-9A6FF6894ADA
  type sphere
  name 61D8DE6E-C2EA-4ECA-91EF-580939A803DA
  c 350 50 0
  r 98
}

object {
  shader 51EF3EF7-D828-4C14-A1B7-3C9373A07D25
  type sphere
  name CB9CF3FC-27AF-4D24-84AE-1F1772A1FF81
  c 247.4873809814453 50 247.4873809814453
  r 98
}

object {
  shader B61885EB-70E1-4D67-9D3D-167740C05B23
  type sphere
  name 42CFA890-6610-46AB-BCA8-6191FD2791D8
  c 2.1430611191891602e-14 50 350
  r 98
}

object {
  shader C2CAFB9D-9572-4149-B9AC-E3D05CF17581
  type sphere
  name FC01A818-2E52-4862-93FD-E6E6FBF11ED4
  c -247.4873809814453 50 247.4873809814453
  r 98
}

object {
  shader 232167D9-2E42-43A1-A8CE-2BE8B03AA5D9
  type sphere
  name 3D412389-1028-4194-B866-1AF26DD3C812
  c -350 50 4.2861222383783204e-14
  r 98
}

object {
  shader 0733E7A0-6DEC-461A-8430-B4584DA09073
  type sphere
  name 55E85757-0B35-4F72-BA70-AC08A26F417A
  c -247.4873809814453 50 -247.4873809814453
  r 98
}

object {
  shader 140175B7-5E84-4914-A0E3-9FBB511DA6C9
  type sphere
  name F7FE65D2-4730-4D34-971C-DA6903F3791F
  c -6.42918335756748e-14 50 -350
  r 98
}

object {
  shader C920CCB1-7D82-4F97-BD72-F20522931611
  type sphere
  name 75CD1829-AA1B-4B85-900D-5AB10C385F1E
  c 247.4873809814453 50 -247.4873809814453
  r 98
}

object {
  shader AC550690-4868-4ED5-8626-9855F3B62555
  type sphere
  name 0F6B69BC-9570-4745-BF1F-01DF876C7D16
  c 0 250 0
  r 250
}

