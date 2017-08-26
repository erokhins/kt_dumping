'contextExpression' @ [48:18] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [48:36] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'facade' @ [49:19] ==> val facade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'analyze' @ [49:26] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'contextExpression' @ [49:34] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'facade' @ [50:20] ==> val facade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'moduleDescriptor' @ [50:27] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'builtIns' @ [50:44] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'arrayListOf' @ [52:28] ==> public fun <T> arrayListOf(vararg elements: ClassDescriptor): ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'builtIns' @ [52:40] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'collection' @ [52:49] ==> public final val KotlinBuiltIns.collection: ClassDescriptor[MyPropertyDescriptor]

'builtIns' @ [52:61] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'array' @ [52:70] ==> public final val KotlinBuiltIns.array: ClassDescriptor[MyPropertyDescriptor]

'values' @ [53:19] ==> public final fun values(): Array<PrimitiveType> defined in org.jetbrains.kotlin.builtins.PrimitiveType[SimpleFunctionDescriptorImpl]

'mapTo' @ [53:28] ==> public inline fun <T, R, C : MutableCollection<in ClassDescriptor>> Array<out PrimitiveType>.mapTo(destination: ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */, transform: (PrimitiveType) -> ClassDescriptor): ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrimitiveType
    <R> -> ClassDescriptor
    <C : MutableCollection<in R>> -> ArrayList<ClassDescriptor>

'forbiddenClasses' @ [53:34] ==> val forbiddenClasses: ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'builtIns' @ [53:54] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'getPrimitiveArrayClassDescriptor' @ [53:63] ==> @NotNull public open fun getPrimitiveArrayClassDescriptor(@NotNull p0: PrimitiveType): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [53:96] ==> value-parameter it: PrimitiveType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'receiverType' @ [55:6] ==> value-parameter receiverType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'context' @ [55:22] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'getType' @ [55:30] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'contextExpression' @ [55:38] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'let' @ [55:59] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'listOf' @ [56:14] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [56:21] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [56:27] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'supertypes' @ [56:30] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'any' @ [56:44] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [57:26] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [57:29] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [57:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'importableFqName' @ [57:64] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'forbiddenClasses' @ [58:13] ==> val forbiddenClasses: ArrayList<ClassDescriptor> /* = ArrayList<ClassDescriptor> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'any' @ [58:30] ==> public inline fun <T> Iterable<ClassDescriptor>.any(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [58:36] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqNameSafe' @ [58:39] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'fqName' @ [58:53] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [59:19] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'contextExpression' @ [62:17] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'getResolutionScope' @ [62:35] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'context' @ [62:54] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'facade' @ [62:63] ==> val facade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'KtPsiFactory' @ [64:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'contextExpression' @ [64:35] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'Suppress' @ [65:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'generateSequence' @ [66:12] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Int?, nextFunction: (Int) -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'it' @ [66:34] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [67:14] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> FunctionDescriptor?): Sequence<FunctionDescriptor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> FunctionDescriptor?

'psiFactory' @ [68:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'createExpressionByPattern' @ [68:52] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [68:87] ==> value-parameter receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'contextExpression' @ [68:109] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'it' @ [68:139] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'componentCallExpr' @ [69:34] ==> val componentCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[LocalVariableDescriptor]

'analyzeInContext' @ [69:52] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [69:69] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[LocalVariableDescriptor]

'contextExpression' @ [69:76] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions[ValueParameterDescriptorImpl]

'componentCallExpr' @ [70:17] ==> val componentCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[LocalVariableDescriptor]

'getResolvedCall' @ [70:35] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [70:51] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [70:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'takeWhile' @ [72:14] ==> public fun <T> Sequence<FunctionDescriptor?>.takeWhile(predicate: (FunctionDescriptor?) -> Boolean): Sequence<FunctionDescriptor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor?

'it' @ [72:26] ==> value-parameter it: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [72:40] ==> value-parameter it: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.getApplicableComponentFunctions.<anonymous>[ValueParameterDescriptorImpl]

'isValidOperator' @ [72:43] ==> public fun FunctionDescriptor.isValidOperator(): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'toList' @ [73:14] ==> public fun <T> Sequence<FunctionDescriptor?>.toList(): List<FunctionDescriptor?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor?

'getApplicableComponentFunctions' @ [83:21] ==> private fun getApplicableComponentFunctions(contextExpression: KtExpression, receiverType: KotlinType?, receiverExpression: KtExpression?): List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable[SimpleFunctionDescriptorImpl]

'contextExpression' @ [83:53] ==> value-parameter contextExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[ValueParameterDescriptorImpl]

'type' @ [83:72] ==> value-parameter type: KotlinType? = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[ValueParameterDescriptorImpl]

'receiverExpression' @ [83:78] ==> value-parameter receiverExpression: KtExpression? = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[ValueParameterDescriptorImpl]

'functions' @ [84:9] ==> val functions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[LocalVariableDescriptor]

'size' @ [84:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'invoke' @ [84:37] ==> public abstract operator fun invoke(p1: List<FunctionDescriptor>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'emptyList' @ [84:46] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getApplication' @ [86:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [86:45] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'invoke' @ [86:68] ==> public abstract operator fun invoke(p1: List<FunctionDescriptor>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'functions' @ [86:77] ==> val functions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[LocalVariableDescriptor]

'editor' @ [88:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[ValueParameterDescriptorImpl]

'invoke' @ [88:32] ==> public abstract operator fun invoke(p1: List<FunctionDescriptor>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'emptyList' @ [88:41] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'JBList' @ [90:16] ==> public constructor JBList<E : (Any..Any?)>(@NotNull vararg p0: (String..String?)) defined in com.intellij.ui.components.JBList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'getInstance' @ [91:20] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopupBuilder' @ [92:14] ==> @NotNull public open fun createListPopupBuilder(@NotNull p0: raw (JList<(Any..Any?)>..JList<*>)): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'list' @ [92:37] ==> val list: JBList<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[LocalVariableDescriptor]

'setMovable' @ [93:14] ==> public open fun setMovable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setResizable' @ [94:14] ==> public open fun setResizable(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setRequestFocus' @ [95:14] ==> public open fun setRequestFocus(p0: Boolean): (PopupChooserBuilder..PopupChooserBuilder?) defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'setItemChoosenCallback' @ [96:14] ==> @NotNull public final fun setItemChoosenCallback(@NotNull p0: () -> Unit): PopupChooserBuilder defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[MyFunctionDescriptor]

'invoke' @ [96:39] ==> public abstract operator fun invoke(p1: List<FunctionDescriptor>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'if (list.selectedIndex == 0) emptyList() else functions' @ [96:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<FunctionDescriptor>, elseBranch: List<FunctionDescriptor>): List<FunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<FunctionDescriptor>

'list' @ [96:52] ==> val list: JBList<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[LocalVariableDescriptor]

'selectedIndex' @ [96:57] ==> public final var <E : (Any..Any?)> JBList<String>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'emptyList' @ [96:77] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'functions' @ [96:94] ==> val functions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[LocalVariableDescriptor]

'createPopup' @ [97:14] ==> @NotNull public open fun createPopup(): JBPopup defined in com.intellij.openapi.ui.popup.PopupChooserBuilder[JavaMethodDescriptor]

'showInBestPositionFor' @ [98:14] ==> public abstract fun showInBestPositionFor(@NotNull p0: Editor): Unit defined in com.intellij.openapi.ui.popup.JBPopup[JavaMethodDescriptor]

'editor' @ [98:36] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.chooseApplicableComponentFunctions[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [102:12] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'apply' @ [102:36] ==> @InlineOnly public inline fun <T> LinkedHashSet<String>.apply(block: LinkedHashSet<String>.() -> Unit): LinkedHashSet<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<String>

'descriptor' @ [103:30] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

'name' @ [103:41] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [103:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'?:' @ [104:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'DescriptorToSourceUtilsIde' @ [104:30] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [104:57] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [104:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

'descriptor' @ [104:84] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

'name' @ [104:118] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'descriptorName' @ [105:32] ==> val descriptorName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent.<anonymous>[LocalVariableDescriptor]

'componentName' @ [106:13] ==> val componentName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent.<anonymous>[LocalVariableDescriptor]

'descriptorName' @ [106:30] ==> val descriptorName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [107:13] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

'returnType' @ [107:24] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [107:36] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'addAll' @ [107:42] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'KotlinNameSuggester' @ [107:49] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [107:69] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [107:88] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'validator' @ [107:92] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

'add' @ [109:9] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'KotlinNameSuggester' @ [109:13] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [109:33] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'componentName' @ [109:51] ==> val componentName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent.<anonymous>[LocalVariableDescriptor]

'validator' @ [109:66] ==> value-parameter validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.suggestNamesForComponent[ValueParameterDescriptorImpl]

