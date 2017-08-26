'KtUsefulTestCase' @ [38:33] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'Test' @ [39:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'JvmResolveUtil' @ [41:32] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [41:47] ==> @JvmStatic public final fun analyze(environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea' @ [42:33] ==> @NotNull public open fun createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea(@NotNull p0: Disposable, @NotNull p1: ConfigurationKind, @NotNull p2: TestJdkKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'myTestRootDisposable' @ [42:91] ==> @NotNull protected/*protected and package*/ final val myTestRootDisposable: Disposable defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest[JavaPropertyDescriptor]

'ALL' @ [42:131] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [42:148] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'moduleDescriptor' @ [43:11] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [46:17] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'findClassAcrossModuleDependencies' @ [46:34] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [46:76] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [46:85] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'appendableClass' @ [48:22] ==> val appendableClass: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [49:18] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'findFirstFunction' @ [50:18] ==> public inline fun MemberScope.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[DeserializedSimpleFunctionDescriptor]

'it' @ [50:48] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [50:51] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [50:67] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [50:83] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'let' @ [50:89] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'KotlinBuiltIns' @ [50:93] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'isChar' @ [50:109] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'append' @ [52:29] ==> val append: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'valueParameters' @ [52:36] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'single' @ [52:52] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.single(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [52:61] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'assertTrue' @ [54:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'parameterType' @ [54:20] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'parameterType' @ [55:26] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'upperIfFlexible' @ [55:40] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [57:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'upperBound' @ [57:20] ==> val upperBound: SimpleType defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'javaClass' @ [57:31] ==> public val <T : Any> SimpleType.javaClass: Class<SimpleType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SimpleType

'simpleName' @ [57:41] ==> public final val <T : (Any..Any?)> Class<SimpleType>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SimpleType

'assertTrue' @ [59:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'parameterType' @ [59:20] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'lowerIfFlexible' @ [59:34] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [59:56] ==> val upperBound: SimpleType defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testBasicFlexibleTypeCase[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [59:67] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'Test' @ [64:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'trimMargin' @ [72:21] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea' @ [76:26] ==> @NotNull public open fun createEnvironmentWithJdkAndNullabilityAnnotationsFromIdea(@NotNull p0: Disposable, @NotNull p1: ConfigurationKind, @NotNull p2: TestJdkKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'myTestRootDisposable' @ [77:33] ==> @NotNull protected/*protected and package*/ final val myTestRootDisposable: Disposable defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest[JavaPropertyDescriptor]

'ALL' @ [77:73] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [77:90] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'JvmResolveUtil' @ [80:17] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [80:32] ==> @JvmStatic public final fun analyze(file: KtFile, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'createFile' @ [81:41] ==> @NotNull public open fun createFile(@NotNull @NonNls p0: String, @NotNull p1: String, @NotNull p2: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'text' @ [81:63] ==> val text: String defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'environment' @ [81:69] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'project' @ [81:81] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'environment' @ [82:25] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'moduleDescriptor' @ [83:19] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [86:17] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'findClassAcrossModuleDependencies' @ [86:34] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [86:76] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [86:85] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'aClass' @ [89:17] ==> val aClass: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'getMemberScope' @ [89:24] ==> @NotNull public abstract fun getMemberScope(@NotNull p0: TypeSubstitution): MemberScope defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[JavaMethodDescriptor]

'create' @ [90:53] ==> @JvmStatic public final fun create(typeConstructor: TypeConstructor, arguments: List<TypeProjection>): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'aClass' @ [91:33] ==> val aClass: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'typeConstructor' @ [91:40] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'listOf' @ [91:57] ==> public fun <T> listOf(element: TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'moduleDescriptor' @ [91:64] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'builtIns' @ [91:81] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'stringType' @ [91:90] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'asTypeProjection' @ [91:101] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'memberScope' @ [96:17] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'findFirstFunction' @ [96:29] ==> public inline fun MemberScope.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[DeserializedSimpleFunctionDescriptor]

'it' @ [97:21] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [97:24] ==> public final val CallableMemberDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [97:40] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [97:56] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'let' @ [97:62] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'KotlinBuiltIns' @ [97:66] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'isChar' @ [97:82] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'assertTrue' @ [100:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'append' @ [100:20] ==> val append: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'original' @ [100:27] ==> public final val SimpleFunctionDescriptor.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'append' @ [100:40] ==> val append: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'memberScope' @ [102:19] ==> val memberScope: MemberScope defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'findSingleFunction' @ [102:31] ==> public fun MemberScope.findSingleFunction(name: Name): FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir[DeserializedSimpleFunctionDescriptor]

'identifier' @ [102:55] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'assertTrue' @ [104:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'foo' @ [104:20] ==> val foo: FunctionDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

'original' @ [104:24] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'foo' @ [104:37] ==> val foo: FunctionDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MemoryOptimizationsTest.testSubstitutorDoNotRecreateUnchangedDescriptor[LocalVariableDescriptor]

