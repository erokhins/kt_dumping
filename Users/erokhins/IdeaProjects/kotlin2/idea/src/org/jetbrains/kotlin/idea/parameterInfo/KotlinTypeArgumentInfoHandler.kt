'KotlinTypeArgumentInfoHandlerBase<ClassDescriptor>' @ [43:44] ==> public constructor KotlinTypeArgumentInfoHandlerBase<TParameterOwner : DeclarationDescriptor>() defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[ClassConstructorDescriptorImpl]
Inferred types:
    <TParameterOwner : DeclarationDescriptor> -> ClassDescriptor

'descriptor' @ [44:69] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinClassTypeArgumentInfoHandler.fetchTypeParameters[ValueParameterDescriptorImpl]

'typeConstructor' @ [44:80] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [44:96] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'argumentList' @ [47:24] ==> value-parameter argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinClassTypeArgumentInfoHandler.findParameterOwners[ValueParameterDescriptorImpl]

'parent' @ [47:37] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'userType' @ [48:16] ==> val userType: KtUserType defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinClassTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'referenceExpression' @ [48:25] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'resolveMainReferenceToDescriptors' @ [48:46] ==> public fun KtElement.resolveMainReferenceToDescriptors(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [48:83] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> ClassDescriptor

'it' @ [48:96] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinClassTypeArgumentInfoHandler.findParameterOwners.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [51:58] ==> public fun <T> setOf(element: Class<KtUserType>): Set<Class<KtUserType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<KtUserType>

'java' @ [51:82] ==> public val <T> KClass<KtUserType>.java: Class<KtUserType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtUserType

'KotlinTypeArgumentInfoHandlerBase<FunctionDescriptor>' @ [54:47] ==> public constructor KotlinTypeArgumentInfoHandlerBase<TParameterOwner : DeclarationDescriptor>() defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[ClassConstructorDescriptorImpl]
Inferred types:
    <TParameterOwner : DeclarationDescriptor> -> FunctionDescriptor

'descriptor' @ [55:72] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.fetchTypeParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [55:83] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'argumentList' @ [58:27] ==> value-parameter argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[ValueParameterDescriptorImpl]

'parent' @ [58:40] ==> public final val KtTypeArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argumentList' @ [59:30] ==> value-parameter argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[ValueParameterDescriptorImpl]

'analyze' @ [59:43] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [59:67] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'callElement' @ [60:20] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'getCall' @ [60:32] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [60:40] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'call' @ [61:26] ==> val call: Call defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'resolveCandidates' @ [61:31] ==> public fun Call.resolveCandidates(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, expectedType: KotlinType = ..., filterOutWrongReceiver: Boolean = ..., filterOutByVisibility: Boolean = ...): Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [61:49] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'callElement' @ [61:65] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'getResolutionFacade' @ [61:77] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'candidates' @ [62:16] ==> val candidates: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners[LocalVariableDescriptor]

'map' @ [63:18] ==> public inline fun <T, R> Iterable<ResolvedCall<FunctionDescriptor>>.map(transform: (ResolvedCall<FunctionDescriptor>) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>
    <R> -> FunctionDescriptor

'it' @ [63:24] ==> value-parameter it: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [63:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'distinctBy' @ [64:18] ==> public inline fun <T, K> Iterable<FunctionDescriptor>.distinctBy(selector: (FunctionDescriptor) -> String): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <K> -> String

'buildPresentation' @ [64:31] ==> protected final fun buildPresentation(parameters: List<TypeParameterDescriptor>, currentIndex: Int): Triple<String, Int, Int> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler[SimpleFunctionDescriptorImpl]

'it' @ [64:49] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinFunctionTypeArgumentInfoHandler.findParameterOwners.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [64:52] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'-' @ [64:68] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'first' @ [64:72] ==> public final val first: String defined in kotlin.Triple[DeserializedPropertyDescriptor]

'setOf' @ [67:58] ==> public fun <T> setOf(element: Class<KtCallElement>): Set<Class<KtCallElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<KtCallElement>

'java' @ [67:85] ==> public val <T> KClass<KtCallElement>.java: Class<KtCallElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallElement

'COMMA' @ [74:63] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [75:61] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'java' @ [77:69] ==> public val <T> KClass<KtTypeArgumentList>.java: Class<KtTypeArgumentList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeArgumentList

'o' @ [79:63] ==> value-parameter o: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.getActualParameters[ValueParameterDescriptorImpl]

'arguments' @ [79:65] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'toTypedArray' @ [79:75] ==> public inline fun <reified T> Collection<(KtTypeProjection..KtTypeProjection?)>.toTypedArray(): Array<(KtTypeProjection..KtTypeProjection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'setOf' @ [81:50] ==> public fun <T> setOf(vararg elements: Class<out KtTypeParameterListOwner>): Set<Class<out KtTypeParameterListOwner>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out KtTypeParameterListOwner>

'java' @ [81:79] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'java' @ [81:114] ==> public val <T> KClass<KtVariableDeclaration>.java: Class<KtVariableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtVariableDeclaration

'java' @ [81:143] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'DEFAULT_PARAMETER_CLOSE_CHARS' @ [83:64] ==> public const final val DEFAULT_PARAMETER_CLOSE_CHARS: String defined in com.intellij.lang.parameterInfo.ParameterInfoUtils[JavaPropertyDescriptor]

'emptyArray' @ [88:97] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'emptyArray' @ [89:102] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'context' @ [92:9] ==> value-parameter context: CreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.showParameterInfo[ValueParameterDescriptorImpl]

'showHint' @ [92:17] ==> public abstract fun showHint(p0: (PsiElement..PsiElement?), p1: Int, p2: raw (ParameterInfoHandler<(Any..Any?), (Any..Any?)>..ParameterInfoHandler<*, *>?)): Unit defined in com.intellij.lang.parameterInfo.CreateParameterInfoContext[JavaMethodDescriptor]

'element' @ [92:26] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.showParameterInfo[ValueParameterDescriptorImpl]

'element' @ [92:35] ==> value-parameter element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.showParameterInfo[ValueParameterDescriptorImpl]

'textRange' @ [92:43] ==> public final val KtTypeArgumentList.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [92:53] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'this' @ [92:66] ==> <this> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[LazyClassReceiverParameterDescriptor]

'context' @ [96:23] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[ValueParameterDescriptorImpl]

'file' @ [96:31] ==> public final val UpdateParameterInfoContext.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findElementAt' @ [96:36] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'context' @ [96:50] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[ValueParameterDescriptorImpl]

'offset' @ [96:58] ==> public final val UpdateParameterInfoContext.offset: Int[MyPropertyDescriptor]

'element' @ [97:28] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'getParentOfType' @ [97:36] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtTypeArgumentList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeArgumentList

'element' @ [98:24] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'parents' @ [98:32] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [98:40] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [98:52] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo.<anonymous>[ValueParameterDescriptorImpl]

'argumentList' @ [98:58] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'lastOrNull' @ [98:73] ==> public fun <T> Sequence<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'argument' @ [99:13] ==> val argument: KtTypeProjection? defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'getActualParameters' @ [100:29] ==> public open fun getActualParameters(o: KtTypeArgumentList): Array<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[SimpleFunctionDescriptorImpl]

'argumentList' @ [100:49] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'arguments' @ [101:25] ==> val arguments: Array<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'indexOf' @ [101:35] ==> public fun <@OnlyInputTypes T> Array<out (PsiElement..PsiElement?)>.indexOf(element: (PsiElement..PsiElement?)): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [101:43] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'context' @ [102:13] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[ValueParameterDescriptorImpl]

'setCurrentParameter' @ [102:21] ==> public abstract fun setCurrentParameter(p0: Int): Unit defined in com.intellij.lang.parameterInfo.UpdateParameterInfoContext[JavaMethodDescriptor]

'index' @ [102:41] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'context' @ [103:13] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[ValueParameterDescriptorImpl]

'setHighlightedParameter' @ [103:21] ==> public abstract fun setHighlightedParameter(p0: (Any..Any?)): Unit defined in com.intellij.lang.parameterInfo.UpdateParameterInfoContext[JavaMethodDescriptor]

'element' @ [103:45] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'argumentList' @ [105:16] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForUpdatingParameterInfo[LocalVariableDescriptor]

'context' @ [109:20] ==> value-parameter context: CreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[ValueParameterDescriptorImpl]

'file' @ [109:28] ==> public final val CreateParameterInfoContext.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [111:21] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[LocalVariableDescriptor]

'findElementAt' @ [111:26] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'context' @ [111:40] ==> value-parameter context: CreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[ValueParameterDescriptorImpl]

'offset' @ [111:48] ==> public final val CreateParameterInfoContext.offset: Int[MyPropertyDescriptor]

'token' @ [112:28] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[LocalVariableDescriptor]

'getParentOfType' @ [112:34] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtTypeArgumentList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeArgumentList

'findParameterOwners' @ [114:31] ==> protected abstract fun findParameterOwners(argumentList: KtTypeArgumentList): Collection<TParameterOwner>? defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[SimpleFunctionDescriptorImpl]

'argumentList' @ [114:51] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[LocalVariableDescriptor]

'context' @ [116:9] ==> value-parameter context: CreateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[ValueParameterDescriptorImpl]

'itemsToShow' @ [116:17] ==> public final var CreateParameterInfoContext.itemsToShow: (Array<(Any..Any?)>?..Array<out (Any..Any?)>?)[MyPropertyDescriptor]

'parameterOwners' @ [116:31] ==> val parameterOwners: Collection<TParameterOwner> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[LocalVariableDescriptor]

'toTypedArray' @ [116:47] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'argumentList' @ [117:16] ==> val argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.findElementForParameterInfo[LocalVariableDescriptor]

'context' @ [121:13] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'parameterOwner' @ [121:21] ==> public final var UpdateParameterInfoContext.parameterOwner: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argumentList' @ [121:40] ==> value-parameter argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'context' @ [122:13] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'removeHint' @ [122:21] ==> public abstract fun removeHint(): Unit defined in com.intellij.lang.parameterInfo.UpdateParameterInfoContext[JavaMethodDescriptor]

'context' @ [125:22] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'offset' @ [125:30] ==> public final val UpdateParameterInfoContext.offset: Int[MyPropertyDescriptor]

'argumentList' @ [126:30] ==> value-parameter argumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'allChildren' @ [126:43] ==> public val PsiElement.allChildren: PsiChildRange defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [127:18] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [127:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [127:33] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'offset' @ [127:47] ==> val offset: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[LocalVariableDescriptor]

'count' @ [128:18] ==> public inline fun <T> Sequence<PsiElement>.count(predicate: (PsiElement) -> Boolean): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [128:26] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [128:29] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [128:34] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COMMA' @ [128:58] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'context' @ [129:9] ==> value-parameter context: UpdateParameterInfoContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[ValueParameterDescriptorImpl]

'setCurrentParameter' @ [129:17] ==> public abstract fun setCurrentParameter(p0: Int): Unit defined in com.intellij.lang.parameterInfo.UpdateParameterInfoContext[JavaMethodDescriptor]

'parameterIndex' @ [129:37] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateParameterInfo[LocalVariableDescriptor]

'!' @ [133:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'updateUIOrFail' @ [133:14] ==> private final fun updateUIOrFail(itemToShow: TParameterOwner, context: ParameterInfoUIContext): Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[SimpleFunctionDescriptorImpl]

'itemToShow' @ [133:29] ==> value-parameter itemToShow: TParameterOwner defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUI[ValueParameterDescriptorImpl]

'context' @ [133:41] ==> value-parameter context: ParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUI[ValueParameterDescriptorImpl]

'context' @ [134:13] ==> value-parameter context: ParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUI[ValueParameterDescriptorImpl]

'isUIComponentEnabled' @ [134:21] ==> public final var ParameterInfoUIContext.isUIComponentEnabled: Boolean[MyPropertyDescriptor]

'context' @ [140:28] ==> value-parameter context: ParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[ValueParameterDescriptorImpl]

'currentParameterIndex' @ [140:36] ==> public final val ParameterInfoUIContext.currentParameterIndex: Int[MyPropertyDescriptor]

'currentIndex' @ [141:13] ==> val currentIndex: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'fetchTypeParameters' @ [143:26] ==> protected abstract fun fetchTypeParameters(descriptor: TParameterOwner): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[SimpleFunctionDescriptorImpl]

'itemToShow' @ [143:46] ==> value-parameter itemToShow: TParameterOwner defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[ValueParameterDescriptorImpl]

'component1' @ [145:14] ==> public final operator fun component1(): String defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [145:20] ==> public final operator fun component2(): Int defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [145:43] ==> public final operator fun component3(): Int defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'buildPresentation' @ [145:66] ==> protected final fun buildPresentation(parameters: List<TypeParameterDescriptor>, currentIndex: Int): Triple<String, Int, Int> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase[SimpleFunctionDescriptorImpl]

'parameters' @ [145:84] ==> val parameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'currentIndex' @ [145:96] ==> val currentIndex: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'context' @ [147:9] ==> value-parameter context: ParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[ValueParameterDescriptorImpl]

'setupUIComponentPresentation' @ [147:17] ==> public abstract fun setupUIComponentPresentation(p0: (String..String?), p1: Int, p2: Int, p3: Boolean, p4: Boolean, p5: Boolean, p6: (Color..Color?)): (String..String?) defined in com.intellij.lang.parameterInfo.ParameterInfoUIContext[JavaMethodDescriptor]

'text' @ [147:46] ==> val text: String defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'currentParameterStart' @ [147:52] ==> val currentParameterStart: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'currentParameterEnd' @ [147:75] ==> val currentParameterEnd: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[LocalVariableDescriptor]

'context' @ [149:46] ==> value-parameter context: ParameterInfoUIContext defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.updateUIOrFail[ValueParameterDescriptorImpl]

'defaultParameterColor' @ [149:54] ==> public final val ParameterInfoUIContext.defaultParameterColor: (Color..Color?)[MyPropertyDescriptor]

'-' @ [158:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [159:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'buildString' @ [161:20] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [163:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [163:26] ==> public final operator fun component2(): TypeParameterDescriptor defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameters' @ [163:40] ==> value-parameter parameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[ValueParameterDescriptorImpl]

'withIndex' @ [163:51] ==> public fun <T> Iterable<TypeParameterDescriptor>.withIndex(): Iterable<IndexedValue<TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'index' @ [164:21] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'append' @ [164:32] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'index' @ [166:21] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'currentIndex' @ [166:30] ==> value-parameter currentIndex: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[ValueParameterDescriptorImpl]

'currentParameterStart' @ [167:21] ==> var currentParameterStart: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[LocalVariableDescriptor]

'length' @ [167:45] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'parameter' @ [170:21] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'isReified' @ [170:31] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'append' @ [171:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when (parameter.variance) {
                    Variance.INVARIANT -> {}
                    Variance.IN_VARIANCE -> append("in ")
                    Variance.OUT_VARIANCE -> append("out ")
                }' @ [174:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'parameter' @ [174:23] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'variance' @ [174:33] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [175:30] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [176:30] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'append' @ [176:45] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'OUT_VARIANCE' @ [177:30] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'append' @ [177:46] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [180:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameter' @ [180:24] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'name' @ [180:34] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [180:39] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'parameter' @ [182:35] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [182:45] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'if (upperBounds.size == 1) {
                    val upperBound = upperBounds.single()
                    if (!upperBound.isAnyOrNullableAny() || upperBound.nullability() == TypeNullability.NOT_NULL) { // skip Any? or Any!
                        append(" : ").append(DescriptorRenderer.SHORT_NAMES_IN_TYPES.renderType(upperBound))
                    }
                }
                else if (upperBounds.size > 1) {
                    needWhere = true
                }' @ [183:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'upperBounds' @ [183:21] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'size' @ [183:33] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'upperBounds' @ [184:38] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'single' @ [184:50] ==> public fun <T> List<(KotlinType..KotlinType?)>.single(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'!' @ [185:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [185:26] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'isAnyOrNullableAny' @ [185:37] ==> public fun KotlinType.isAnyOrNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [185:61] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'nullability' @ [185:72] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'NOT_NULL' @ [185:105] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'append' @ [186:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [186:39] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DescriptorRenderer' @ [186:46] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [186:65] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [186:86] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [186:97] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [189:26] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'size' @ [189:38] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'needWhere' @ [190:21] ==> var needWhere: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'index' @ [193:21] ==> val index: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'currentIndex' @ [193:30] ==> value-parameter currentIndex: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[ValueParameterDescriptorImpl]

'currentParameterEnd' @ [194:21] ==> var currentParameterEnd: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[LocalVariableDescriptor]

'length' @ [194:43] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'needWhere' @ [198:17] ==> var needWhere: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'append' @ [199:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameters' @ [202:35] ==> value-parameter parameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[ValueParameterDescriptorImpl]

'parameter' @ [203:39] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [203:49] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'upperBounds' @ [204:25] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'size' @ [204:37] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'upperBounds' @ [205:44] ==> val upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'needComma' @ [206:33] ==> var needComma: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'append' @ [206:44] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'needComma' @ [207:29] ==> var needComma: Boolean defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'append' @ [208:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'parameter' @ [208:36] ==> val parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'name' @ [208:46] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [208:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'append' @ [208:63] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [208:77] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DescriptorRenderer' @ [208:84] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [208:103] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [208:124] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'upperBound' @ [208:135] ==> val upperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation.<anonymous>[LocalVariableDescriptor]

'Triple' @ [214:16] ==> public constructor Triple<out A, out B, out C>(first: String, second: Int, third: Int) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int
    <out C> -> Int

'text' @ [214:23] ==> val text: String defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[LocalVariableDescriptor]

'currentParameterStart' @ [214:29] ==> var currentParameterStart: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[LocalVariableDescriptor]

'currentParameterEnd' @ [214:52] ==> var currentParameterEnd: Int defined in org.jetbrains.kotlin.idea.parameterInfo.KotlinTypeArgumentInfoHandlerBase.buildPresentation[LocalVariableDescriptor]

