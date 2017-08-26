'if (detectDefaultParameters && hasOrInheritsParametersWithDefaultValue()) {
                context.scope().declareName(context.getNameForDescriptor(this).ident + Namer.DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX)
            }
            else {
                context.getNameForDescriptor(this)
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName, elseBranch: JsName): JsName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName

'detectDefaultParameters' @ [58:17] ==> value-parameter detectDefaultParameters: Boolean defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'hasOrInheritsParametersWithDefaultValue' @ [58:44] ==> public fun FunctionDescriptor.hasOrInheritsParametersWithDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [59:17] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'scope' @ [59:25] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'declareName' @ [59:33] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'context' @ [59:45] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [59:53] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'this' @ [59:74] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall.getNameForFunctionWithPossibleDefaultParam[ReceiverParameterDescriptorImpl]

'ident' @ [59:80] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX' @ [59:94] ==> public const final val DEFAULT_PARAMETER_IMPLEMENTOR_SUFFIX: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'context' @ [62:17] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [62:25] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'this' @ [62:46] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall.getNameForFunctionWithPossibleDefaultParam[ReceiverParameterDescriptorImpl]

'toDescriptor' @ [65:40] ==> value-parameter toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'getNameForFunctionWithPossibleDefaultParam' @ [65:53] ==> local final fun FunctionDescriptor.getNameForFunctionWithPossibleDefaultParam(): JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[SimpleFunctionDescriptorImpl]

'JsNameRef' @ [66:39] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'overriddenMemberFunctionName' @ [66:49] ==> val overriddenMemberFunctionName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'thisObject' @ [66:79] ==> value-parameter thisObject: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'SmartList' @ [68:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsParameter

'SmartList' @ [69:16] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsExpression

'isExtension' @ [71:25] ==> public open fun isExtension(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'fromDescriptor' @ [71:37] ==> value-parameter fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'declareTemporaryName' @ [72:53] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'getReceiverParameterName' @ [72:80] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'parameters' @ [73:9] ==> val parameters: SmartList<JsParameter> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'add' @ [73:20] ==> public open fun add(element: (JsParameter..JsParameter?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'JsParameter' @ [73:24] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'extensionFunctionReceiverName' @ [73:36] ==> val extensionFunctionReceiverName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'args' @ [74:9] ==> val args: SmartList<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'add' @ [74:14] ==> public open fun add(element: (JsExpression..JsExpression?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'JsNameRef' @ [74:18] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'extensionFunctionReceiverName' @ [74:28] ==> val extensionFunctionReceiverName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'fromDescriptor' @ [77:19] ==> value-parameter fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'valueParameters' @ [77:34] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'param' @ [78:25] ==> val param: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'name' @ [78:31] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [78:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'declareTemporaryName' @ [79:35] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'paramName' @ [79:56] ==> val paramName: String defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'parameters' @ [80:9] ==> val parameters: SmartList<JsParameter> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'add' @ [80:20] ==> public open fun add(element: (JsParameter..JsParameter?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'JsParameter' @ [80:24] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'jsParamName' @ [80:36] ==> val jsParamName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'args' @ [81:9] ==> val args: SmartList<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'add' @ [81:14] ==> public open fun add(element: (JsExpression..JsExpression?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'JsNameRef' @ [81:18] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'jsParamName' @ [81:28] ==> val jsParamName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'context' @ [84:21] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'intrinsics' @ [84:29] ==> @NotNull public open fun intrinsics(): Intrinsics defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getFunctionIntrinsic' @ [84:42] ==> @NotNull public open fun getFunctionIntrinsic(@NotNull descriptor: FunctionDescriptor): FunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.Intrinsics[JavaMethodDescriptor]

'toDescriptor' @ [84:63] ==> value-parameter toDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'if (intrinsic.exists() && intrinsic is FunctionIntrinsicWithReceiverComputed) {
        intrinsic.apply(thisObject, args, context)
    }
    else {
        JsInvocation(overriddenMemberFunctionRef, args)
    }' @ [85:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'intrinsic' @ [85:26] ==> val intrinsic: FunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'exists' @ [85:36] ==> public open fun exists(): Boolean defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.basic.FunctionIntrinsic[SimpleFunctionDescriptorImpl]

'intrinsic' @ [85:48] ==> val intrinsic: FunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'intrinsic' @ [86:9] ==> val intrinsic: FunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'apply' @ [86:19] ==> public abstract fun apply(receiver: JsExpression?, arguments: List<JsExpression>, context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.basic.FunctionIntrinsicWithReceiverComputed[SimpleFunctionDescriptorImpl]

'thisObject' @ [86:25] ==> value-parameter thisObject: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'args' @ [86:37] ==> val args: SmartList<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'context' @ [86:43] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'JsInvocation' @ [89:9] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'overriddenMemberFunctionRef' @ [89:22] ==> val overriddenMemberFunctionRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'args' @ [89:51] ==> val args: SmartList<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'invocation' @ [92:5] ==> val invocation: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'source' @ [92:16] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'source' @ [92:25] ==> value-parameter source: PsiElement? defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'simpleReturnFunction' @ [94:26] ==> @NotNull public open fun simpleReturnFunction(@NotNull functionScope: JsScope, @NotNull returnExpression: JsExpression): JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [94:47] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'scope' @ [94:55] ==> @NotNull public open fun scope(): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'invocation' @ [94:64] ==> val invocation: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'functionObject' @ [95:5] ==> val functionObject: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'source' @ [95:20] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'source' @ [95:29] ==> value-parameter source: PsiElement? defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'finalElement' @ [95:37] ==> public val PsiElement.finalElement: PsiElement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[PropertyDescriptorImpl]

'functionObject' @ [96:5] ==> val functionObject: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'parameters' @ [96:20] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'addAll' @ [96:31] ==> public abstract fun addAll(elements: Collection<(JsParameter..JsParameter?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameters' @ [96:38] ==> val parameters: SmartList<JsParameter> defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'fromDescriptor' @ [98:28] ==> value-parameter fromDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'getNameForFunctionWithPossibleDefaultParam' @ [98:43] ==> local final fun FunctionDescriptor.getNameForFunctionWithPossibleDefaultParam(): JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[SimpleFunctionDescriptorImpl]

'prototypeOf' @ [100:35] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [100:47] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'getInnerReference' @ [100:55] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [100:73] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[ValueParameterDescriptorImpl]

'JsNameRef' @ [101:23] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'fromFunctionName' @ [101:33] ==> val fromFunctionName: JsName defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'prototypeRef' @ [101:51] ==> val prototypeRef: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'assignment' @ [102:23] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'functionRef' @ [102:34] ==> val functionRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'functionObject' @ [102:47] ==> val functionObject: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.generateDelegateCall[LocalVariableDescriptor]

'makeStmt' @ [102:63] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'isEmpty' @ [106:9] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [106:27] ==> public fun <T> emptyList(): List<Pair<List<T>, S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<List<T>, S>

'invoke' @ [109:24] ==> public abstract operator fun invoke(p1: T): S defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [109:35] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[ReceiverParameterDescriptorImpl]

'mutableListOf' @ [110:18] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<List<T>, S>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<List<T>, S>

'component1' @ [112:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [112:18] ==> public final operator fun component2(): T defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [112:24] ==> public fun <T> Iterable<T>.asSequence(): Sequence<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'withIndex' @ [112:37] ==> public fun <T> Sequence<T>.withIndex(): Sequence<IndexedValue<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'drop' @ [112:49] ==> public fun <T> Sequence<IndexedValue<T>>.drop(n: Int): Sequence<IndexedValue<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<T>

'invoke' @ [113:19] ==> public abstract operator fun invoke(p1: T): S defined in kotlin.Function1[FunctionInvokeDescriptor]

'e' @ [113:30] ==> val e: T defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'cls' @ [114:13] ==> val cls: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'lastClass' @ [114:20] ==> var lastClass: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'result' @ [115:13] ==> val result: MutableList<Pair<List<T>, S>> defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'Pair' @ [115:23] ==> public constructor Pair<out A, out B>(first: List<T>, second: S) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<T>
    <out B> -> S

'subList' @ [115:28] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [115:36] ==> var lastIndex: Int defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'index' @ [115:47] ==> val index: Int defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'lastClass' @ [115:55] ==> var lastClass: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'lastClass' @ [116:13] ==> var lastClass: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'cls' @ [116:25] ==> val cls: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'lastIndex' @ [117:13] ==> var lastIndex: Int defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'index' @ [117:25] ==> val index: Int defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'result' @ [121:5] ==> val result: MutableList<Pair<List<T>, S>> defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'Pair' @ [121:15] ==> public constructor Pair<out A, out B>(first: List<T>, second: S) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<T>
    <out B> -> S

'subList' @ [121:20] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<T> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [121:28] ==> var lastIndex: Int defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'size' @ [121:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lastClass' @ [121:46] ==> var lastClass: S defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'result' @ [122:12] ==> val result: MutableList<Pair<List<T>, S>> defined in org.jetbrains.kotlin.js.translate.utils.splitToRanges[LocalVariableDescriptor]

'type' @ [126:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[ValueParameterDescriptorImpl]

'constructor' @ [126:37] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [126:49] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (classifierDescriptor) {
        is ClassDescriptor -> {
            ReferenceTranslator.translateAsTypeReference(classifierDescriptor, context)
        }
        is TypeParameterDescriptor -> {
            assert(classifierDescriptor.isReified)

            context.usageTracker()?.used(classifierDescriptor)

            context.getNameForDescriptor(classifierDescriptor).makeRef()
        }
        else -> {
            throw IllegalStateException("Can't get reference for $type")
        }
    }' @ [128:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'classifierDescriptor' @ [128:18] ==> val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[LocalVariableDescriptor]

'translateAsTypeReference' @ [130:33] ==> @NotNull public open fun translateAsTypeReference(@NotNull descriptor: ClassDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'classifierDescriptor' @ [130:58] ==> val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[LocalVariableDescriptor]

'context' @ [130:80] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[ValueParameterDescriptorImpl]

'assert' @ [133:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classifierDescriptor' @ [133:20] ==> val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[LocalVariableDescriptor]

'isReified' @ [133:41] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'context' @ [135:13] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[ValueParameterDescriptorImpl]

'usageTracker' @ [135:21] ==> @Nullable public open fun usageTracker(): UsageTracker? defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'used' @ [135:37] ==> public final fun used(descriptor: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.js.translate.context.UsageTracker[SimpleFunctionDescriptorImpl]

'classifierDescriptor' @ [135:42] ==> val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[LocalVariableDescriptor]

'context' @ [137:13] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [137:21] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classifierDescriptor' @ [137:42] ==> val classifierDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[LocalVariableDescriptor]

'makeRef' @ [137:64] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'IllegalStateException' @ [140:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'type' @ [140:67] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.js.translate.utils.getReferenceToJsClass[ValueParameterDescriptorImpl]

'prototypeOf' @ [150:35] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'getInnerReference' @ [150:47] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [150:65] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.addFunctionToPrototype[ValueParameterDescriptorImpl]

'JsNameRef' @ [151:23] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'getNameForDescriptor' @ [151:33] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [151:54] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.addFunctionToPrototype[ValueParameterDescriptorImpl]

'prototypeRef' @ [151:67] ==> val prototypeRef: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.addFunctionToPrototype[LocalVariableDescriptor]

'assignment' @ [152:23] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'functionRef' @ [152:34] ==> val functionRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.addFunctionToPrototype[LocalVariableDescriptor]

'function' @ [152:47] ==> value-parameter function: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.addFunctionToPrototype[ValueParameterDescriptorImpl]

'makeStmt' @ [152:57] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'prototypeOf' @ [160:35] ==> @NotNull public open fun prototypeOf(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'getInnerReference' @ [160:47] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'containingClass' @ [160:65] ==> value-parameter containingClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [161:24] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'propertyDescriptor' @ [161:45] ==> value-parameter propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[ValueParameterDescriptorImpl]

'defineProperty' @ [162:37] ==> @NotNull public open fun defineProperty(@NotNull receiver: JsExpression, @NotNull name: String, @NotNull value: JsExpression): JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'prototypeRef' @ [162:52] ==> val prototypeRef: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[LocalVariableDescriptor]

'propertyName' @ [162:66] ==> val propertyName: JsName defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[LocalVariableDescriptor]

'ident' @ [162:79] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'literal' @ [162:86] ==> value-parameter literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[ValueParameterDescriptorImpl]

'addDeclarationStatement' @ [163:5] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'defineProperty' @ [163:29] ==> val defineProperty: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.addAccessorsToPrototype[LocalVariableDescriptor]

'makeStmt' @ [163:44] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'this' @ [167:9] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.requiresStateMachineTransformation[ReceiverParameterDescriptorImpl]

'context' @ [168:9] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.requiresStateMachineTransformation[ValueParameterDescriptorImpl]

'bindingContext' @ [168:17] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'CONTAINS_NON_TAIL_SUSPEND_CALLS' @ [168:49] ==> public final val CONTAINS_NON_TAIL_SUSPEND_CALLS: (WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>..WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [168:82] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.requiresStateMachineTransformation[ReceiverParameterDescriptorImpl]

'!' @ [175:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [175:10] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'requiresStateMachineTransformation' @ [175:21] ==> public fun FunctionDescriptor.requiresStateMachineTransformation(context: TranslationContext): Boolean defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'context' @ [175:56] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'context' @ [177:37] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'currentModule' @ [177:45] ==> public final val TranslationContext.currentModule: ModuleDescriptor[MyPropertyDescriptor]

'getPackage' @ [177:59] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'COROUTINES_INTRINSICS_PACKAGE_FQ_NAME' @ [177:70] ==> public val COROUTINES_INTRINSICS_PACKAGE_FQ_NAME: FqName defined in org.jetbrains.kotlin.backend.common[DeserializedPropertyDescriptor]

'memberScope' @ [178:14] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedVariables' @ [179:14] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'COROUTINE_SUSPENDED_NAME' @ [179:38] ==> public val COROUTINE_SUSPENDED_NAME: Name defined in org.jetbrains.kotlin.backend.common[DeserializedPropertyDescriptor]

'FROM_BACKEND' @ [179:81] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'first' @ [179:95] ==> public fun <T> Iterable<PropertyDescriptor>.first(): PropertyDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'translateAsTypeReference' @ [181:53] ==> @NotNull public open fun translateAsTypeReference(@NotNull descriptor: ClassDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'getCoroutineBaseClass' @ [181:95] ==> @NotNull public open fun getCoroutineBaseClass(@NotNull context: TranslationContext): ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [181:117] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'context' @ [181:127] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'context' @ [184:13] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [184:21] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getCoroutineProperty' @ [184:59] ==> @NotNull public open fun getCoroutineProperty(@NotNull context: TranslationContext, @NotNull name: String): PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [184:80] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'id' @ [184:89] ==> value-parameter id: String defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata.getCoroutinePropertyName[ValueParameterDescriptorImpl]

'coroutineMetadata' @ [186:5] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'CoroutineMetadata' @ [186:25] ==> public constructor CoroutineMetadata(doResumeName: JsName, stateName: JsName, exceptionStateName: JsName, finallyPathName: JsName, resultName: JsName, exceptionName: JsName, baseClassRef: JsExpression, suspendObjectRef: JsExpression, hasController: Boolean, hasReceiver: Boolean, psiElement: PsiElement?) defined in org.jetbrains.kotlin.js.backend.ast.metadata.CoroutineMetadata[DeserializedClassConstructorDescriptor]

'context' @ [187:28] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [187:36] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getCoroutineDoResumeFunction' @ [187:74] ==> @NotNull public open fun getCoroutineDoResumeFunction(@NotNull context: TranslationContext): FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [187:103] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'translateAsValueReference' @ [188:52] ==> @NotNull public open fun translateAsValueReference(@NotNull descriptor: DeclarationDescriptor, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.reference.ReferenceTranslator[JavaMethodDescriptor]

'suspendPropertyDescriptor' @ [188:78] ==> val suspendPropertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[LocalVariableDescriptor]

'context' @ [188:105] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'coroutineBaseClassRef' @ [189:28] ==> val coroutineBaseClassRef: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[LocalVariableDescriptor]

'getCoroutinePropertyName' @ [190:25] ==> local final fun getCoroutinePropertyName(id: String): JsName defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[SimpleFunctionDescriptorImpl]

'getCoroutinePropertyName' @ [191:34] ==> local final fun getCoroutinePropertyName(id: String): JsName defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[SimpleFunctionDescriptorImpl]

'getCoroutinePropertyName' @ [192:31] ==> local final fun getCoroutinePropertyName(id: String): JsName defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[SimpleFunctionDescriptorImpl]

'getCoroutinePropertyName' @ [193:26] ==> local final fun getCoroutinePropertyName(id: String): JsName defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[SimpleFunctionDescriptorImpl]

'getCoroutinePropertyName' @ [194:29] ==> local final fun getCoroutinePropertyName(id: String): JsName defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[SimpleFunctionDescriptorImpl]

'hasController' @ [195:29] ==> value-parameter hasController: Boolean defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'descriptor' @ [196:27] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [196:38] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [197:26] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.fillCoroutineMetadata[ValueParameterDescriptorImpl]

'source' @ [197:37] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [197:44] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'JsNameRef' @ [202:19] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'name' @ [202:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[ValueParameterDescriptorImpl]

'parentRef' @ [202:35] ==> value-parameter parentRef: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[ValueParameterDescriptorImpl]

'or' @ [203:26] ==> @NotNull public open fun or(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'selfRef' @ [203:29] ==> val selfRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[LocalVariableDescriptor]

'assignment' @ [203:49] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'selfRef' @ [203:60] ==> val selfRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[LocalVariableDescriptor]

'deepCopy' @ [203:68] ==> @NotNull public open fun deepCopy(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'JsObjectLiteral' @ [203:80] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'newVar' @ [205:23] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'varName' @ [205:30] ==> value-parameter varName: JsName defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[ValueParameterDescriptorImpl]

'rhs' @ [205:39] ==> val rhs: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[LocalVariableDescriptor]

'apply' @ [205:44] ==> @InlineOnly public inline fun <T> JsVars.apply(block: (JsVars).() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'exportedPackage' @ [205:52] ==> public var JsVars.exportedPackage: String? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'tag' @ [205:70] ==> value-parameter tag: String defined in org.jetbrains.kotlin.js.translate.utils.definePackageAlias[ValueParameterDescriptorImpl]

'when (this) {
        is KtFunctionLiteral -> rBrace ?: this
        is KtDeclarationWithBody -> (bodyExpression as? KtBlockExpression)?.rBrace ?: bodyExpression ?: this
        is KtLambdaExpression -> bodyExpression?.rBrace ?: this
        else -> this
    }' @ [209:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement, entry1: PsiElement, entry2: PsiElement, entry3: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement

'this' @ [209:19] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.finalElement[ReceiverParameterDescriptorImpl]

'rBrace' @ [210:33] ==> public final val KtFunctionLiteral.rBrace: PsiElement?[MyPropertyDescriptor]

'this' @ [210:43] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.finalElement[ReceiverParameterDescriptorImpl]

'?:' @ [211:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement?

'bodyExpression' @ [211:38] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'rBrace' @ [211:77] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'bodyExpression' @ [211:87] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [211:105] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.finalElement[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [212:34] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'rBrace' @ [212:50] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'this' @ [212:60] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.finalElement[ReceiverParameterDescriptorImpl]

'this' @ [213:17] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.finalElement[ReceiverParameterDescriptorImpl]

