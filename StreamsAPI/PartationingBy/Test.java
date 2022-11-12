
// This is like a if / else if 

jshell> var t = list.stream().    
   ...> collect(Collectors.partitioningBy( a -> a.getFees() < 130000))
t ==> {false=[Registration {Nilar, 20210712, Offline, J ... ne, Java Basic, 100000 }]}


// show t
jshell> t
t ==> {false=[Registration {Nilar, 20210712, Offline, Java Basic, 300000 }, Registration {Mu Mu, 20210821, Online, Spring, 150000 }, Registration {Hla Hla, 20211024, Online, Spring, 150000 }, Registration {Zaw Moe, 20210921, Offline, Spring, 150000 }, Registration {Ko Kyaw, 20210821, Offline, Angular, 140000 }, Registration {Ko Thant, 20210715, Online, Linux, 350000 }], true=[Registration {Aung Aung, 20210712, Online, Java Basic, 100000 }, Registration {Khine Khine, 20220120, Online, Java Basic, 100000 }, Registration {Aye Aung, 20220910, Offline, PHP, 120000 }, Registration {Kyaw Zin, 20210930, Online, Java Basic, 100000 }]}


// How to find Type
jshell> /vars t
|    Map<Boolean,List<Registration>> t = {false=[Registration {Nilar, 20210712, Offline, Java Basic, 300000 }, Registration {Mu Mu, 20210821, Online, Spring, 150000 }, Registration {Hla Hla, 20211024, Online, Spring, 150000 }, Registration {Zaw Moe, 20210921, Offline, Spring, 150000 }, Registration {Ko Kyaw, 20210821, Offline, Angular, 140000 }, Registration {Ko Thant, 20210715, Online, Linux, 350000 }], true=[Registration {Aung Aung, 20210712, Online, Java Basic, 100000 }, Registration {Khine Khine, 20220120, Online, Java Basic, 100000 }, Registration {Aye Aung, 20220910, Offline, PHP, 120000 }, Registration {Kyaw Zin, 20210930, Online, Java Basic, 100000 }]}
