'JvmOverloads' @ [41:27] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'-' @ [43:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'KotlinTypeInfo' @ [45:48] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'None' @ [48:51] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'originalTypeInfo' @ [51:43] ==> public final val originalTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'defaultValueForCall' @ [56:20] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'containingFile' @ [56:41] ==> public final val KtExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'defaultValueParameterReferences' @ [57:9] ==> public final val defaultValueParameterReferences: Map<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'if (defaultValueForCall != null && file != null && (file.isPhysical || file.analysisContext != null)) {
                    val project = file.project
                    val map = LinkedHashMap<PsiReference, DeclarationDescriptor>()

                    defaultValueForCall!!.accept(
                            object : KtTreeVisitorVoid() {
                                private fun selfParameterOrNull(parameter: DeclarationDescriptor?): ValueParameterDescriptor? {
                                    return if (parameter is ValueParameterDescriptor &&
                                               compareDescriptors(project, parameter.containingDeclaration, callableDescriptor)) {
                                        parameter
                                    } else null
                                }

                                private fun selfReceiverOrNull(receiverDescriptor: DeclarationDescriptor?): DeclarationDescriptor? {
                                    if (compareDescriptors(project,
                                                           receiverDescriptor,
                                                           callableDescriptor.extensionReceiverParameter?.containingDeclaration)) {
                                        return receiverDescriptor
                                    }
                                    if (compareDescriptors(project,
                                                           receiverDescriptor,
                                                           callableDescriptor.dispatchReceiverParameter?.containingDeclaration)) {
                                        return receiverDescriptor
                                    }
                                    return null
                                }

                                private fun selfReceiverOrNull(receiver: ImplicitReceiver?): DeclarationDescriptor? {
                                    return selfReceiverOrNull(receiver?.declarationDescriptor)
                                }

                                private fun getRelevantDescriptor(
                                        expression: KtSimpleNameExpression,
                                        ref: KtReference
                                ): DeclarationDescriptor? {
                                    val context = expression.analyze(BodyResolveMode.PARTIAL)

                                    val descriptor = ref.resolveToDescriptors(context).singleOrNull()
                                    if (descriptor is ValueParameterDescriptor) return selfParameterOrNull(descriptor)

                                    if (descriptor is PropertyDescriptor && callableDescriptor is ConstructorDescriptor) {
                                        val parameter = DescriptorToSourceUtils.getSourceFromDescriptor(descriptor) as? KtParameter
                                        return parameter?.let { selfParameterOrNull(context[BindingContext.VALUE_PARAMETER, it]) }
                                    }

                                    val resolvedCall = expression.getResolvedCall(context) ?: return null
                                    (resolvedCall.resultingDescriptor as? ReceiverParameterDescriptor)?.let {
                                        return if (selfReceiverOrNull(it.containingDeclaration) != null) it else null
                                    }

                                    selfReceiverOrNull(resolvedCall.extensionReceiver as? ImplicitReceiver)?.let { return it }
                                    selfReceiverOrNull(resolvedCall.dispatchReceiver as? ImplicitReceiver)?.let { return it }

                                    return null
                                }

                                override fun visitSimpleNameExpression(expression: KtSimpleNameExpression) {
                                    val ref = expression.mainReference
                                    val descriptor = getRelevantDescriptor(expression, ref) ?: return
                                    map[ref] = descriptor
                                }
                            }
                    )

                    map
                }
                else {
                    emptyMap()
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<PsiReference, DeclarationDescriptor>, elseBranch: Map<PsiReference, DeclarationDescriptor>): Map<PsiReference, DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<PsiReference, DeclarationDescriptor>

'defaultValueForCall' @ [58:21] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'file' @ [58:52] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'file' @ [58:69] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'isPhysical' @ [58:74] ==> public final val KtFile.isPhysical: Boolean[MyPropertyDescriptor]

'file' @ [58:88] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'analysisContext' @ [58:93] ==> public var KtFile.analysisContext: PsiElement? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'file' @ [59:35] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'project' @ [59:40] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'LinkedHashMap' @ [60:31] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiReference
    <V : (Any..Any?)> -> DeclarationDescriptor

'defaultValueForCall' @ [62:21] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'accept' @ [62:43] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [63:38] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'if (parameter is ValueParameterDescriptor &&
                                               compareDescriptors(project, parameter.containingDeclaration, callableDescriptor)) {
                                        parameter
                                    } else null' @ [65:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValueParameterDescriptor?, elseBranch: ValueParameterDescriptor?): ValueParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValueParameterDescriptor?

'parameter' @ [65:48] ==> value-parameter parameter: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfParameterOrNull[ValueParameterDescriptorImpl]

'compareDescriptors' @ [66:48] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [66:67] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'parameter' @ [66:76] ==> value-parameter parameter: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfParameterOrNull[ValueParameterDescriptorImpl]

'containingDeclaration' @ [66:86] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'callableDescriptor' @ [66:109] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'parameter' @ [67:41] ==> value-parameter parameter: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfParameterOrNull[ValueParameterDescriptorImpl]

'compareDescriptors' @ [72:41] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [72:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'receiverDescriptor' @ [73:60] ==> value-parameter receiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfReceiverOrNull[ValueParameterDescriptorImpl]

'callableDescriptor' @ [74:60] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [74:79] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'containingDeclaration' @ [74:107] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'receiverDescriptor' @ [75:48] ==> value-parameter receiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfReceiverOrNull[ValueParameterDescriptorImpl]

'compareDescriptors' @ [77:41] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [77:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'receiverDescriptor' @ [78:60] ==> value-parameter receiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfReceiverOrNull[ValueParameterDescriptorImpl]

'callableDescriptor' @ [79:60] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [79:79] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'containingDeclaration' @ [79:106] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'receiverDescriptor' @ [80:48] ==> value-parameter receiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfReceiverOrNull[ValueParameterDescriptorImpl]

'selfReceiverOrNull' @ [86:44] ==> private final fun selfReceiverOrNull(receiverDescriptor: DeclarationDescriptor?): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'receiver' @ [86:63] ==> value-parameter receiver: ImplicitReceiver? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.selfReceiverOrNull[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [86:73] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'expression' @ [93:51] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[ValueParameterDescriptorImpl]

'analyze' @ [93:62] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [93:86] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'ref' @ [95:54] ==> value-parameter ref: KtReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[ValueParameterDescriptorImpl]

'resolveToDescriptors' @ [95:58] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[DeserializedSimpleFunctionDescriptor]

'context' @ [95:79] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'singleOrNull' @ [95:88] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [96:41] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'selfParameterOrNull' @ [96:88] ==> private final fun selfParameterOrNull(parameter: DeclarationDescriptor?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'descriptor' @ [96:108] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'descriptor' @ [98:41] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'callableDescriptor' @ [98:77] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'DescriptorToSourceUtils' @ [99:57] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [99:81] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [99:105] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'parameter' @ [100:48] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'let' @ [100:59] ==> @InlineOnly public inline fun <T, R> KtParameter.let(block: (KtParameter) -> ValueParameterDescriptor?): ValueParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <R> -> ValueParameterDescriptor?

'selfParameterOrNull' @ [100:65] ==> private final fun selfParameterOrNull(parameter: DeclarationDescriptor?): ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'context' @ [100:85] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'VALUE_PARAMETER' @ [100:108] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [100:125] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [103:56] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[ValueParameterDescriptorImpl]

'getResolvedCall' @ [103:67] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [103:83] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'resolvedCall' @ [104:38] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'resultingDescriptor' @ [104:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'let' @ [104:105] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Nothing

'if (selfReceiverOrNull(it.containingDeclaration) != null) it else null' @ [105:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'selfReceiverOrNull' @ [105:52] ==> private final fun selfReceiverOrNull(receiverDescriptor: DeclarationDescriptor?): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [105:71] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [105:74] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'it' @ [105:106] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'selfReceiverOrNull' @ [108:37] ==> private final fun selfReceiverOrNull(receiver: ImplicitReceiver?): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [108:56] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'extensionReceiver' @ [108:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'let' @ [108:110] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Nothing

'it' @ [108:123] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'selfReceiverOrNull' @ [109:37] ==> private final fun selfReceiverOrNull(receiver: ImplicitReceiver?): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [109:56] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor[LocalVariableDescriptor]

'dispatchReceiver' @ [109:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'let' @ [109:109] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Nothing

'it' @ [109:122] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.getRelevantDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [115:47] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mainReference' @ [115:58] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'getRelevantDescriptor' @ [116:54] ==> private final fun getRelevantDescriptor(expression: KtSimpleNameExpression, ref: KtReference): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [116:76] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'ref' @ [116:88] ==> val ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'map' @ [117:37] ==> val map: LinkedHashMap<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'ref' @ [117:41] ==> val ref: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'descriptor' @ [117:48] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'map' @ [122:21] ==> val map: LinkedHashMap<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.<init>[LocalVariableDescriptor]

'emptyMap' @ [125:21] ==> public fun <K, V> emptyMap(): Map<PsiReference, DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiReference
    <V> -> DeclarationDescriptor

'originalIndex' @ [129:39] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'originalIndex' @ [132:17] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'-' @ [132:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'name' @ [136:38] ==> private final var name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'this' @ [139:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[LazyClassReceiverParameterDescriptor]

'name' @ [139:14] ==> private final var name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'name' @ [139:21] ==> value-parameter name: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.setName[ValueParameterDescriptorImpl]

'currentTypeInfo' @ [142:42] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'render' @ [142:58] ==> public fun KotlinTypeInfo.render(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'!' @ [144:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentTypeInfo' @ [144:41] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'isEquivalentTo' @ [144:57] ==> public fun KotlinTypeInfo.isEquivalentTo(other: KotlinTypeInfo): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'originalTypeInfo' @ [144:72] ==> public final val originalTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [149:15] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'currentTypeInfo' @ [153:32] ==> public final var currentTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'render' @ [153:48] ==> public fun KotlinTypeInfo.render(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [154:31] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[ValueParameterDescriptorImpl]

'typeSubstitutor' @ [154:49] ==> public final val typeSubstitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'defaultRendering' @ [154:75] ==> val defaultRendering: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'inheritedCallable' @ [155:35] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[ValueParameterDescriptorImpl]

'baseFunction' @ [155:53] ==> public final val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'currentCallableDescriptor' @ [155:66] ==> public final val currentCallableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'defaultRendering' @ [155:102] ==> val defaultRendering: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'currentBaseFunction' @ [156:29] ==> val currentBaseFunction: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'valueParameters' @ [156:49] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameterIndex' @ [156:65] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[ValueParameterDescriptorImpl]

'type' @ [156:81] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'parameterType' @ [157:13] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'isError' @ [157:27] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'defaultRendering' @ [157:43] ==> val defaultRendering: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'parameterType' @ [158:16] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'renderTypeWithSubstitution' @ [158:30] ==> public fun KotlinType.renderTypeWithSubstitution(substitutor: TypeSubstitutor?, defaultText: String, inArgumentPosition: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'typeSubstitutor' @ [158:57] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'defaultRendering' @ [158:74] ==> val defaultRendering: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.renderType[LocalVariableDescriptor]

'!' @ [162:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritedCallable' @ [162:14] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[ValueParameterDescriptorImpl]

'isInherited' @ [162:32] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'name' @ [162:52] ==> private final var name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'inheritedCallable' @ [164:28] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[ValueParameterDescriptorImpl]

'baseFunction' @ [164:46] ==> public final val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'baseFunction' @ [165:38] ==> val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'originalCallableDescriptor' @ [165:51] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'inheritedCallable' @ [167:43] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[ValueParameterDescriptorImpl]

'originalCallableDescriptor' @ [167:61] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'inheritedFunctionDescriptor' @ [168:45] ==> val inheritedFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'valueParameters' @ [168:73] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalIndex' @ [169:13] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'originalIndex' @ [170:16] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'baseFunctionDescriptor' @ [170:33] ==> val baseFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'valueParameters' @ [170:56] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [170:72] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'originalIndex' @ [171:16] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'inheritedParameterDescriptors' @ [171:33] ==> val inheritedParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'size' @ [171:63] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'name' @ [171:76] ==> private final var name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'inheritedParameterDescriptors' @ [173:34] ==> val inheritedParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'originalIndex' @ [173:64] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'name' @ [173:79] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [173:84] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'baseFunctionDescriptor' @ [174:28] ==> val baseFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'valueParameters' @ [174:51] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalIndex' @ [174:67] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'name' @ [174:82] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [174:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'when {
            oldParamName == inheritedParamName && inheritedFunctionDescriptor !is AnonymousFunctionDescriptor -> name
            else -> inheritedParamName
        }' @ [176:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'oldParamName' @ [177:13] ==> val oldParamName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'inheritedParamName' @ [177:29] ==> val inheritedParamName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'inheritedFunctionDescriptor' @ [177:51] ==> val inheritedFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'name' @ [177:114] ==> private final var name: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'inheritedParamName' @ [178:21] ==> val inheritedParamName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getInheritedName[LocalVariableDescriptor]

'inheritedCallable' @ [183:43] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[ValueParameterDescriptorImpl]

'originalCallableDescriptor' @ [183:61] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'inheritedFunctionDescriptor' @ [184:13] ==> val inheritedFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[LocalVariableDescriptor]

'originalIndex' @ [186:13] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'!' @ [186:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritedCallable' @ [186:40] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[ValueParameterDescriptorImpl]

'hasExpectedType' @ [186:58] ==> public final val hasExpectedType: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'inheritedFunctionDescriptor' @ [188:44] ==> val inheritedFunctionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[LocalVariableDescriptor]

'valueParameters' @ [188:72] ==> public final val AnonymousFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalIndex' @ [188:88] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'DescriptorToSourceUtils' @ [189:25] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [189:49] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'inheritedParameterDescriptor' @ [189:73] ==> val inheritedParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[LocalVariableDescriptor]

'parameter' @ [190:16] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.requiresExplicitType[LocalVariableDescriptor]

'typeReference' @ [190:26] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'inheritedCallable' @ [194:17] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getOriginalParameter[ValueParameterDescriptorImpl]

'declaration' @ [194:35] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'valueParameters' @ [194:64] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'getOrNull' @ [194:81] ==> public fun <T> List<(KtParameter..KtParameter?)>.getOrNull(index: Int): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'originalIndex' @ [194:91] ==> public final val originalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KtPsiFactory' @ [198:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'inheritedCallable' @ [198:39] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'project' @ [198:57] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<out PsiElement>.project: Project[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> Captured(*)

'StringBuilder' @ [200:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'modifierList' @ [202:13] ==> public final val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'buffer' @ [203:13] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'append' @ [203:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'modifierList' @ [203:27] ==> public final val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'text' @ [203:40] ==> public final val KtModifierList.text: (String..String?)[MyPropertyDescriptor]

'append' @ [203:46] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'valOrVar' @ [206:13] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'None' @ [206:38] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'buffer' @ [207:13] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'append' @ [207:20] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'valOrVar' @ [207:27] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'append' @ [207:37] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buffer' @ [210:9] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'append' @ [210:16] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getInheritedName' @ [210:23] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [210:40] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [210:59] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'requiresExplicitType' @ [212:13] ==> public final fun requiresExplicitType(inheritedCallable: KotlinCallableDefinitionUsage<*>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [212:34] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'buffer' @ [213:13] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'append' @ [213:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [213:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'renderType' @ [213:40] ==> public final fun renderType(parameterIndex: Int, inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'parameterIndex' @ [213:51] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'inheritedCallable' @ [213:67] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'!' @ [216:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritedCallable' @ [216:14] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[ValueParameterDescriptorImpl]

'isInherited' @ [216:32] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'defaultValueForParameter' @ [217:13] ==> public final var defaultValueForParameter: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'let' @ [217:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'buffer' @ [217:45] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'append' @ [217:52] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [217:66] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [217:73] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [217:76] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'psiFactory' @ [220:16] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'createParameter' @ [220:27] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'buffer' @ [220:43] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.buildNewParameter[LocalVariableDescriptor]

'toString' @ [220:50] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getOriginalParameter' @ [224:33] ==> private final fun getOriginalParameter(inheritedCallable: KotlinCallableDefinitionUsage<*>): KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [224:54] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'buildNewParameter' @ [225:43] ==> private final fun buildNewParameter(inheritedCallable: KotlinCallableDefinitionUsage<*>, parameterIndex: Int): KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [225:61] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'parameterIndex' @ [225:80] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [227:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalParameter' @ [227:39] ==> val originalParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'originalParameter' @ [228:28] ==> val originalParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'copied' @ [228:46] ==> public fun <T : PsiElement> KtParameter.copied(): KtParameter defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtParameter

'modifierList' @ [230:9] ==> public final val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'let' @ [230:23] ==> @InlineOnly public inline fun <T, R> KtModifierList.let(block: (KtModifierList) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierList
    <R> -> Unit

'newParameter' @ [230:29] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'setModifierList' @ [230:42] ==> public fun KtModifierListOwner.setModifierList(newModifierList: KtModifierList): Unit defined in org.jetbrains.kotlin.psi.addRemoveModifier[DeserializedSimpleFunctionDescriptor]

'it' @ [230:58] ==> value-parameter it: KtModifierList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature.<anonymous>[ValueParameterDescriptorImpl]

'valOrVar' @ [232:13] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'newParameter' @ [232:25] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'valOrVarKeyword' @ [232:38] ==> public final val KtParameter.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'toValVar' @ [232:54] ==> public fun PsiElement?.toValVar(): KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'newParameter' @ [233:13] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'setValOrVar' @ [233:26] ==> public fun KtParameter.setValOrVar(valOrVar: KotlinValVar): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'valOrVar' @ [233:38] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'getInheritedName' @ [236:23] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [236:40] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'newParameter' @ [237:13] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'name' @ [237:26] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'newName' @ [237:34] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'newParameter' @ [238:13] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'setName' @ [238:26] ==> public open fun setName(@NonNls @NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newName' @ [238:34] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'quoteIfNeeded' @ [238:42] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newParameter' @ [241:13] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'typeReference' @ [241:26] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'requiresExplicitType' @ [241:51] ==> public final fun requiresExplicitType(inheritedCallable: KotlinCallableDefinitionUsage<*>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'inheritedCallable' @ [241:72] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'newParameter' @ [242:13] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'typeReference' @ [242:26] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'psiFactory' @ [242:42] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'createType' @ [242:53] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'renderType' @ [242:64] ==> public final fun renderType(parameterIndex: Int, inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'parameterIndex' @ [242:75] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'inheritedCallable' @ [242:91] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'!' @ [245:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inheritedCallable' @ [245:14] ==> value-parameter inheritedCallable: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[ValueParameterDescriptorImpl]

'isInherited' @ [245:32] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'defaultValueForParameter' @ [246:13] ==> public final var defaultValueForParameter: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'let' @ [246:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> PsiElement?

'newParameter' @ [246:45] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

'setDefaultValue' @ [246:58] ==> public fun KtParameter.setDefaultValue(newDefaultValue: KtExpression): PsiElement? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'it' @ [246:74] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature.<anonymous>[ValueParameterDescriptorImpl]

'newParameter' @ [249:16] ==> val newParameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo.getDeclarationSignature[LocalVariableDescriptor]

