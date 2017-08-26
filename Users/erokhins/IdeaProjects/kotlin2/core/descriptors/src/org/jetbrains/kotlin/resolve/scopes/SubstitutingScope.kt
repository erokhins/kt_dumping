'givenSubstitutor' @ [32:31] ==> value-parameter givenSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.<init>[ValueParameterDescriptorImpl]

'substitution' @ [32:48] ==> public final val TypeSubstitutor.substitution: TypeSubstitution[MyPropertyDescriptor]

'wrapWithCapturingSubstitution' @ [32:61] ==> public fun TypeSubstitution.wrapWithCapturingSubstitution(needApproximation: Boolean = ...): TypeSubstitution defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'buildSubstitutor' @ [32:93] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[SimpleFunctionDescriptorImpl]

'lazy' @ [36:36] ==> public fun <T> lazy(initializer: () -> Collection<DeclarationDescriptor>): Lazy<Collection<DeclarationDescriptor>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<DeclarationDescriptor>

'substitute' @ [36:43] ==> private final fun <D : DeclarationDescriptor> substitute(descriptors: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> DeclarationDescriptor

'workerScope' @ [36:54] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getContributedDescriptors' @ [36:66] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'substitutor' @ [39:13] ==> private final val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'isEmpty' @ [39:25] ==> public final val TypeSubstitutor.isEmpty: Boolean[MyPropertyDescriptor]

'descriptor' @ [39:41] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'substitutedDescriptors' @ [41:13] ==> private final var substitutedDescriptors: MutableMap<DeclarationDescriptor, DeclarationDescriptor>? defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'substitutedDescriptors' @ [42:13] ==> private final var substitutedDescriptors: MutableMap<DeclarationDescriptor, DeclarationDescriptor>? defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'HashMap' @ [42:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> DeclarationDescriptor
    <V : (Any..Any?)> -> DeclarationDescriptor

'substitutedDescriptors' @ [45:27] ==> private final var substitutedDescriptors: MutableMap<DeclarationDescriptor, DeclarationDescriptor>? defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getOrPut' @ [45:52] ==> public inline fun <K, V> MutableMap<DeclarationDescriptor, DeclarationDescriptor>.getOrPut(key: DeclarationDescriptor, defaultValue: () -> DeclarationDescriptor): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> DeclarationDescriptor
    <V> -> DeclarationDescriptor

'descriptor' @ [45:61] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'when (descriptor) {
                is Substitutable<*> -> descriptor.substitute(substitutor).sure {
                    "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, " +
                    "but $descriptor substitution fails"
                }
                else -> error("Unknown descriptor in scope: $descriptor")
            }' @ [46:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptorNonRoot, entry1: DeclarationDescriptorNonRoot): DeclarationDescriptorNonRoot[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptorNonRoot

'descriptor' @ [46:19] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'descriptor' @ [47:40] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'substitute' @ [47:51] ==> public abstract fun substitute(substitutor: TypeSubstitutor): DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.descriptors.Substitutable[SimpleFunctionDescriptorImpl]

'substitutor' @ [47:62] ==> private final val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'sure' @ [47:75] ==> public inline fun <T : Any> DeclarationDescriptorNonRoot?.sure(message: () -> String): DeclarationDescriptorNonRoot defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptorNonRoot

'+' @ [48:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [49:27] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'error' @ [51:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [51:62] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'Suppress' @ [55:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'substituted' @ [56:16] ==> val substituted: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[LocalVariableDescriptor]

'substitutor' @ [60:13] ==> private final val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'isEmpty' @ [60:25] ==> public final val TypeSubstitutor.isEmpty: Boolean[MyPropertyDescriptor]

'descriptors' @ [60:41] ==> value-parameter descriptors: Collection<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'descriptors' @ [61:13] ==> value-parameter descriptors: Collection<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'isEmpty' @ [61:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [61:43] ==> value-parameter descriptors: Collection<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'newHashSetWithExpectedSize' @ [63:22] ==> public fun <E> newHashSetWithExpectedSize(expectedSize: Int): HashSet<D> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> D

'descriptors' @ [63:52] ==> value-parameter descriptors: Collection<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'size' @ [63:64] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'descriptors' @ [64:28] ==> value-parameter descriptors: Collection<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[ValueParameterDescriptorImpl]

'substitute' @ [65:30] ==> private final fun <D : DeclarationDescriptor> substitute(descriptor: D): D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> D

'descriptor' @ [65:41] ==> val descriptor: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[LocalVariableDescriptor]

'result' @ [66:13] ==> val result: HashSet<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[LocalVariableDescriptor]

'add' @ [66:20] ==> public open fun add(element: D): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'substitute' @ [66:24] ==> val substitute: D defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[LocalVariableDescriptor]

'result' @ [69:16] ==> val result: HashSet<D> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute[LocalVariableDescriptor]

'substitute' @ [72:82] ==> private final fun <D : DeclarationDescriptor> substitute(descriptors: Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> PropertyDescriptor

'workerScope' @ [72:93] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getContributedVariables' @ [72:105] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [72:129] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [72:135] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedVariables[ValueParameterDescriptorImpl]

'workerScope' @ [75:13] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getContributedClassifier' @ [75:25] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [75:50] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [75:56] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedClassifier[ValueParameterDescriptorImpl]

'let' @ [75:67] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> ClassifierDescriptor): ClassifierDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> ClassifierDescriptor

'substitute' @ [75:73] ==> private final fun <D : DeclarationDescriptor> substitute(descriptor: ClassifierDescriptor): ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassifierDescriptor

'it' @ [75:84] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedClassifier.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [77:82] ==> private final fun <D : DeclarationDescriptor> substitute(descriptors: Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> SimpleFunctionDescriptor

'workerScope' @ [77:93] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getContributedFunctions' @ [77:105] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [77:129] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [77:135] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.getContributedFunctions[ValueParameterDescriptorImpl]

'_allDescriptors' @ [80:77] ==> private final val _allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'workerScope' @ [82:39] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getFunctionNames' @ [82:51] ==> public abstract fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'workerScope' @ [83:39] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'getVariableNames' @ [83:51] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'p' @ [86:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [86:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [86:19] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[LazyClassReceiverParameterDescriptor]

'java' @ [86:31] ==> public val <T> KClass<out SubstitutingScope>.java: Class<out SubstitutingScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SubstitutingScope

'simpleName' @ [86:36] ==> public final val <T : (Any..Any?)> Class<out SubstitutingScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SubstitutingScope

'p' @ [87:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [87:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [89:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [89:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [90:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [90:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [91:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [91:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'substitutor' @ [91:19] ==> private final val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'p' @ [92:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [92:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [94:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'print' @ [94:11] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'workerScope' @ [95:9] ==> private final val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope[PropertyDescriptorImpl]

'printScopeStructure' @ [95:21] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'p' @ [95:41] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'withholdIndentOnce' @ [95:43] ==> @NotNull public open fun withholdIndentOnce(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [97:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [97:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [98:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [98:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

