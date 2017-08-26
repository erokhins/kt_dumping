'KotlinTestWithEnvironment' @ [33:53] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'createEnvironmentWithJdk' @ [35:16] ==> @NotNull protected/*protected and package*/ open fun createEnvironmentWithJdk(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest[JavaMethodDescriptor]

'JDK_ONLY' @ [35:59] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [35:81] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'JvmResolveUtil' @ [39:22] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [39:37] ==> @JvmStatic public final fun analyze(environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'environment' @ [39:45] ==> public final val AdditionalBuiltInsMembersSignatureListsTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'moduleDescriptor' @ [39:58] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'JvmBuiltInsSettings' @ [42:17] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings[FakeCallableDescriptorForObject]

'BLACK_LIST_METHOD_SIGNATURES' @ [42:37] ==> public final val BLACK_LIST_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[DeserializedPropertyDescriptor]

'MUTABLE_METHOD_SIGNATURES' @ [43:37] ==> public final val MUTABLE_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[DeserializedPropertyDescriptor]

'BLACK_LIST_CONSTRUCTOR_SIGNATURES' @ [44:37] ==> public final val BLACK_LIST_CONSTRUCTOR_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[DeserializedPropertyDescriptor]

'WHITE_LIST_METHOD_SIGNATURES' @ [45:37] ==> public final val WHITE_LIST_METHOD_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[DeserializedPropertyDescriptor]

'WHITE_LIST_CONSTRUCTOR_SIGNATURES' @ [46:37] ==> public final val WHITE_LIST_CONSTRUCTOR_SIGNATURES: Set<String> defined in org.jetbrains.kotlin.load.kotlin.JvmBuiltInsSettings.Companion[DeserializedPropertyDescriptor]

'blackList' @ [48:37] ==> val blackList: Set<String> defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk[LocalVariableDescriptor]

'groupBy' @ [48:47] ==> public inline fun <T, K, V> Iterable<String>.groupBy(keySelector: (String) -> String, valueTransform: (String) -> String): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> String
    <V> -> String

'it' @ [48:57] ==> value-parameter it: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [48:60] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [48:79] ==> value-parameter it: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [48:82] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'groupedByInternalName' @ [50:9] ==> val groupedByInternalName: Map<String, List<String>> defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk[LocalVariableDescriptor]

'entries' @ [50:31] ==> public abstract val entries: Set<Map.Entry<String, List<String>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [50:39] ==> @HidesMembers public inline fun <T> Iterable<Map.Entry<String, List<String>>>.forEach(action: (Map.Entry<String, List<String>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, List<String>>

'component1' @ [52:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<String>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'component2' @ [52:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<String>>.component2(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'it' @ [52:50] ==> value-parameter it: Map.Entry<String, List<String>> defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [54:21] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk[LocalVariableDescriptor]

'resolveClassByFqName' @ [54:28] ==> public fun ModuleDescriptor.resolveClassByFqName(fqName: FqName, lookupLocation: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'byInternalName' @ [55:42] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'internalName' @ [55:57] ==> val internalName: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

'fqNameForClassNameWithoutDollars' @ [55:71] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'FROM_TEST' @ [55:122] ==> enum entry FROM_TEST defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classDescriptor' @ [58:25] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [58:41] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'jvmDescriptors' @ [60:13] ==> val jvmDescriptors: List<String> defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

'forEach' @ [60:28] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'jvmDescriptor' @ [62:34] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [62:48] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (stringName == "<init>")
                            classDescriptor.constructors
                        else
                            scope.getContributedFunctions(Name.identifier(stringName), NoLookupLocation.FROM_TEST)' @ [64:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(FunctionDescriptor..FunctionDescriptor?)>, elseBranch: Collection<(FunctionDescriptor..FunctionDescriptor?)>): Collection<(FunctionDescriptor..FunctionDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'stringName' @ [64:29] ==> val stringName: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [65:29] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

'constructors' @ [65:45] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'scope' @ [67:29] ==> val scope: MemberScope defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

'getContributedFunctions' @ [67:35] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [67:64] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'stringName' @ [67:75] ==> val stringName: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[LocalVariableDescriptor]

'FROM_TEST' @ [67:105] ==> enum entry FROM_TEST defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'functions' @ [69:17] ==> val functions: Collection<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[LocalVariableDescriptor]

'singleOrNull' @ [69:27] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.singleOrNull(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [70:21] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isEffectivelyPublicApi' @ [70:24] ==> public val DeclarationDescriptorWithVisibility.isEffectivelyPublicApi: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [70:50] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'computeJvmDescriptor' @ [70:53] ==> public fun FunctionDescriptor.computeJvmDescriptor(withReturnType: Boolean = ...): String defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'jvmDescriptor' @ [70:79] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fail' @ [71:22] ==> public open fun fail(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaMethodDescriptor]

'jvmDescriptor' @ [71:69] ==> value-parameter jvmDescriptor: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'internalName' @ [71:87] ==> val internalName: String defined in org.jetbrains.kotlin.serialization.builtins.AdditionalBuiltInsMembersSignatureListsTest.testAllListedSignaturesExistInJdk.<anonymous>[LocalVariableDescriptor]

