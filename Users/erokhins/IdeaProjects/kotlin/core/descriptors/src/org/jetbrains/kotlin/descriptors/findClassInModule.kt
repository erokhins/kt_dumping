'getPackage' @ [23:33] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'classId' @ [23:44] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[ValueParameterDescriptorImpl]

'packageFqName' @ [23:52] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'classId' @ [24:20] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[ValueParameterDescriptorImpl]

'relativeClassName' @ [24:28] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'pathSegments' @ [24:46] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageViewDescriptor' @ [25:25] ==> val packageViewDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'memberScope' @ [25:47] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'getContributedClassifier' @ [25:59] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'segments' @ [25:84] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'first' @ [25:93] ==> public fun <T> List<(Name..Name?)>.first(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'FROM_DESERIALIZATION' @ [25:119] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'topLevelClass' @ [26:18] ==> val topLevelClass: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'segments' @ [27:18] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'subList' @ [27:27] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<(Name..Name?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'segments' @ [27:38] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'size' @ [27:47] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'result' @ [28:9] ==> var result: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'result' @ [28:18] ==> var result: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'unsubstitutedInnerClassesScope' @ [28:25] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [28:56] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [28:81] ==> val name: (Name..Name?) defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'FROM_DESERIALIZATION' @ [28:104] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'result' @ [30:12] ==> var result: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findClassAcrossModuleDependencies[LocalVariableDescriptor]

'findClassAcrossModuleDependencies' @ [36:25] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors in file findClassInModule.kt[SimpleFunctionDescriptorImpl]

'classId' @ [36:59] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[ValueParameterDescriptorImpl]

'existingClass' @ [37:9] ==> val existingClass: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[LocalVariableDescriptor]

'existingClass' @ [37:39] ==> val existingClass: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[LocalVariableDescriptor]

'generateSequence' @ [40:31] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassId?, nextFunction: (ClassId) -> ClassId?): Sequence<ClassId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassId

'classId' @ [40:48] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[ValueParameterDescriptorImpl]

'map' @ [40:83] ==> public fun <T, R> Sequence<ClassId>.map(transform: (ClassId) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Int

'toList' @ [40:93] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'notFoundClasses' @ [42:12] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[ValueParameterDescriptorImpl]

'getClass' @ [42:28] ==> public final fun getClass(classId: ClassId, typeParametersCount: List<Int>): ClassDescriptor defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[SimpleFunctionDescriptorImpl]

'classId' @ [42:37] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[ValueParameterDescriptorImpl]

'typeParametersCount' @ [42:46] ==> val typeParametersCount: List<Int> defined in org.jetbrains.kotlin.descriptors.findNonGenericClassAcrossDependencies[LocalVariableDescriptor]

'getPackage' @ [49:33] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[SimpleFunctionDescriptorImpl]

'classId' @ [49:44] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[ValueParameterDescriptorImpl]

'packageFqName' @ [49:52] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'classId' @ [50:20] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[ValueParameterDescriptorImpl]

'relativeClassName' @ [50:28] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'pathSegments' @ [50:46] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'segments' @ [51:25] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'size' @ [51:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'packageViewDescriptor' @ [52:30] ==> val packageViewDescriptor: PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'memberScope' @ [52:52] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[PropertyDescriptorImpl]

'getContributedClassifier' @ [52:64] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'segments' @ [52:89] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'first' @ [52:98] ==> public fun <T> List<(Name..Name?)>.first(): (Name..Name?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'FROM_DESERIALIZATION' @ [52:124] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'lastNameIndex' @ [53:9] ==> val lastNameIndex: Int defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'topLevelClassifier' @ [53:36] ==> val topLevelClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'topLevelClassifier' @ [55:24] ==> val topLevelClassifier: ClassifierDescriptor? defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'segments' @ [56:18] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'subList' @ [56:27] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<(Name..Name?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'lastNameIndex' @ [56:38] ==> val lastNameIndex: Int defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'currentClass' @ [57:9] ==> var currentClass: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'currentClass' @ [57:24] ==> var currentClass: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'unsubstitutedInnerClassesScope' @ [57:37] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [57:68] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [57:93] ==> val name: (Name..Name?) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'FROM_DESERIALIZATION' @ [57:116] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'segments' @ [59:20] ==> val segments: (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'lastNameIndex' @ [59:29] ==> val lastNameIndex: Int defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'currentClass' @ [60:12] ==> var currentClass: ClassDescriptor defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [60:25] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [60:50] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'lastName' @ [60:75] ==> val lastName: (Name..Name?) defined in org.jetbrains.kotlin.descriptors.findTypeAliasAcrossModuleDependencies[LocalVariableDescriptor]

'FROM_DESERIALIZATION' @ [60:102] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

