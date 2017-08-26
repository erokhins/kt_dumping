'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [46:14] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[ValueParameterDescriptorImpl]

'isReallySuccess' @ [46:27] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [46:53] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'resolvedCall' @ [47:26] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [47:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [49:39] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'valueParameters' @ [49:50] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [50:18] ==> public inline fun <T, R : Any> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapNotNull(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue>?): List<Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R : Any> -> Pair<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), DefaultValue>

'defaultParameterValue' @ [50:44] ==> public final fun defaultParameterValue(parameter: ValueParameterDescriptor, project: Project): OptionalParametersHelper.DefaultValue? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[SimpleFunctionDescriptorImpl]

'parameter' @ [50:66] ==> value-parameter parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [50:77] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[ValueParameterDescriptorImpl]

'let' @ [50:87] ==> @InlineOnly public inline fun <T, R> OptionalParametersHelper.DefaultValue.let(block: (OptionalParametersHelper.DefaultValue) -> Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue>): Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DefaultValue
    <R> -> Pair<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), DefaultValue>

'parameter' @ [50:93] ==> value-parameter parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [50:106] ==> value-parameter it: OptionalParametersHelper.DefaultValue defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [51:18] ==> public fun <K, V> Iterable<Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue>>.toMap(): Map<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> DefaultValue

'parameterToDefaultValue' @ [52:13] ==> val parameterToDefaultValue: Map<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'isEmpty' @ [52:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [52:55] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'resolvedCall' @ [56:25] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[ValueParameterDescriptorImpl]

'call' @ [56:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'getValueArgumentsInParentheses' @ [56:43] ==> public fun Call.getValueArgumentsInParentheses(): List<ValueArgument> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [57:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueArgument

'arguments' @ [58:26] ==> val arguments: List<ValueArgument> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'asReversed' @ [58:36] ==> public fun <T> List<ValueArgument>.asReversed(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'!' @ [59:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [59:18] ==> public abstract operator fun invoke(p1: ValueArgument): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'argument' @ [59:26] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'!' @ [59:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [59:40] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'matchesDefault' @ [59:49] ==> private final fun ValueArgument.matchesDefault(resolvedCall: ResolvedCall<out CallableDescriptor>, parameterToDefaultValue: Map<ValueParameterDescriptor, OptionalParametersHelper.DefaultValue>): Boolean defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [59:64] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[ValueParameterDescriptorImpl]

'parameterToDefaultValue' @ [59:78] ==> val parameterToDefaultValue: Map<(ValueParameterDescriptor..ValueParameterDescriptor?), OptionalParametersHelper.DefaultValue> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'if (!argument.isNamed()) break else continue' @ [60:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [60:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argument' @ [60:22] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'isNamed' @ [60:31] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'argumentsToDrop' @ [63:13] ==> val argumentsToDrop: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'add' @ [63:29] ==> public open fun add(element: ValueArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argument' @ [63:33] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'argumentsToDrop' @ [65:16] ==> val argumentsToDrop: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.detectArgumentsToDropForDefaults[LocalVariableDescriptor]

'resolvedCall' @ [69:25] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[ValueParameterDescriptorImpl]

'getParameterForArgument' @ [69:38] ==> public fun <D : CallableDescriptor> ResolvedCall<out CallableDescriptor>.getParameterForArgument(valueArgument: ValueArgument?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'this' @ [69:62] ==> <this> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[ReceiverParameterDescriptorImpl]

'parameterToDefaultValue' @ [70:28] ==> value-parameter parameterToDefaultValue: Map<ValueParameterDescriptor, OptionalParametersHelper.DefaultValue> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[ValueParameterDescriptorImpl]

'parameter' @ [70:52] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[LocalVariableDescriptor]

'defaultValue' @ [71:26] ==> val defaultValue: OptionalParametersHelper.DefaultValue defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[LocalVariableDescriptor]

'substituteArguments' @ [71:39] ==> private final fun OptionalParametersHelper.DefaultValue.substituteArguments(resolvedCall: ResolvedCall<out CallableDescriptor>): KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [71:59] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [72:34] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [73:16] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[LocalVariableDescriptor]

'text' @ [73:35] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [73:43] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.matchesDefault[LocalVariableDescriptor]

'text' @ [73:54] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'parameterUsages' @ [77:13] ==> public final val parameterUsages: Map<ValueParameterDescriptor, Collection<KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[PropertyDescriptorImpl]

'isEmpty' @ [77:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'expression' @ [77:47] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[PropertyDescriptorImpl]

'Key' @ [79:19] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'component1' @ [81:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, Collection<KtExpression>>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> Collection<KtExpression>

'component2' @ [81:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, Collection<KtExpression>>.component2(): Collection<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> Collection<KtExpression>

'parameterUsages' @ [81:37] ==> public final val parameterUsages: Map<ValueParameterDescriptor, Collection<KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[PropertyDescriptorImpl]

'resolvedCall' @ [82:36] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[ValueParameterDescriptorImpl]

'valueArguments' @ [82:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'parameter' @ [82:64] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'resolvedArgument' @ [83:17] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'resolvedArgument' @ [84:32] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'valueArgument' @ [84:49] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'getArgumentExpression' @ [84:65] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'usages' @ [85:17] ==> val usages: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'forEach' @ [85:24] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [85:34] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [85:37] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(KtExpression..KtExpression?)>..Key<(KtExpression..KtExpression?)>?), @Nullable p1: KtExpression?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'key' @ [85:57] ==> val key: Key<KtExpression> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'argument' @ [85:62] ==> val argument: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expression' @ [90:30] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[PropertyDescriptorImpl]

'copied' @ [90:41] ==> @Suppress public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtExpression

'expression' @ [92:9] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[PropertyDescriptorImpl]

'forEachDescendantOfType' @ [92:20] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [92:60] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [92:63] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(KtExpression..KtExpression?)>..Key<(KtExpression..KtExpression?)>?), @Nullable p1: KtExpression?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'key' @ [92:83] ==> val key: Key<KtExpression> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'ArrayList' @ [94:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtExpression, KtExpression>

'expressionCopy' @ [95:9] ==> var expressionCopy: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'forEachDescendantOfType' @ [95:24] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [96:31] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [96:34] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(KtExpression..KtExpression?)>..Key<(KtExpression..KtExpression?)>?)): KtExpression? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'key' @ [96:54] ==> val key: Key<KtExpression> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'replacement' @ [97:17] ==> val replacement: KtExpression? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[LocalVariableDescriptor]

'replacements' @ [98:17] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'add' @ [98:30] ==> public open fun add(element: Pair<KtExpression, KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [98:34] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[ValueParameterDescriptorImpl]

'replacement' @ [98:40] ==> val replacement: KtExpression? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments.<anonymous>[LocalVariableDescriptor]

'component1' @ [102:15] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [102:27] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'replacements' @ [102:43] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expression' @ [103:28] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'replace' @ [103:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'replacement' @ [103:47] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expression' @ [104:17] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expressionCopy' @ [104:31] ==> var expressionCopy: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expressionCopy' @ [105:17] ==> var expressionCopy: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'replaced' @ [105:34] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'expressionCopy' @ [109:16] ==> var expressionCopy: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.substituteArguments[LocalVariableDescriptor]

'!' @ [118:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [118:14] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [118:24] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [120:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [120:14] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [120:24] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'parameter' @ [121:30] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [121:40] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'firstOrNull' @ [121:62] ==> public inline fun <T> Iterable<ValueParameterDescriptor>.firstOrNull(predicate: (ValueParameterDescriptor) -> Boolean): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor

'it' @ [121:76] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [121:79] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'defaultParameterValueExpression' @ [122:20] ==> public final fun defaultParameterValueExpression(parameter: ValueParameterDescriptor, project: Project): KtExpression? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[SimpleFunctionDescriptorImpl]

'overridden' @ [122:52] ==> val overridden: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[LocalVariableDescriptor]

'project' @ [122:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'DescriptorToSourceUtilsIde' @ [127:27] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [127:54] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [127:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'parameter' @ [127:81] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[ValueParameterDescriptorImpl]

'navigationElement' @ [127:93] ==> public final val PsiElement.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'declaration' @ [128:16] ==> val declaration: KtParameter? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValueExpression[LocalVariableDescriptor]

'defaultValue' @ [128:29] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultParameterValueExpression' @ [134:26] ==> public final fun defaultParameterValueExpression(parameter: ValueParameterDescriptor, project: Project): KtExpression? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper[SimpleFunctionDescriptorImpl]

'parameter' @ [134:58] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[ValueParameterDescriptorImpl]

'project' @ [134:69] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[ValueParameterDescriptorImpl]

'parameter' @ [136:29] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[ValueParameterDescriptorImpl]

'containingDeclaration' @ [136:39] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'valueParameters' @ [136:61] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'toSet' @ [136:77] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.toSet(): Set<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'HashMap' @ [138:31] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> MutableCollection<KtExpression>

'expression' @ [140:30] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'analyze' @ [140:41] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [140:65] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'expression' @ [141:9] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'forEachDescendantOfType' @ [141:20] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'bindingContext' @ [142:26] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [142:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [142:74] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [143:17] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue.<anonymous>[LocalVariableDescriptor]

'target' @ [143:55] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue.<anonymous>[LocalVariableDescriptor]

'allParameters' @ [143:65] ==> val allParameters: Set<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'parameterUsages' @ [144:17] ==> val parameterUsages: HashMap<ValueParameterDescriptor, MutableCollection<KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'getOrPut' @ [144:33] ==> public inline fun <K, V> MutableMap<ValueParameterDescriptor, MutableCollection<KtExpression>>.getOrPut(key: ValueParameterDescriptor, defaultValue: () -> MutableCollection<KtExpression>): MutableCollection<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> MutableCollection<KtExpression>

'target' @ [144:42] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [144:52] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'add' @ [144:66] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'it' @ [144:70] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue.<anonymous>[ValueParameterDescriptorImpl]

'DefaultValue' @ [148:16] ==> public constructor DefaultValue(expression: KtExpression, parameterUsages: Map<ValueParameterDescriptor, Collection<KtExpression>>) defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.DefaultValue[ClassConstructorDescriptorImpl]

'expression' @ [148:29] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

'parameterUsages' @ [148:41] ==> val parameterUsages: HashMap<ValueParameterDescriptor, MutableCollection<KtExpression>> defined in org.jetbrains.kotlin.idea.core.OptionalParametersHelper.defaultParameterValue[LocalVariableDescriptor]

