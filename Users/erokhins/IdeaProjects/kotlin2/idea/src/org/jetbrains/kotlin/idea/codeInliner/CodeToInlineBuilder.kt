'KtPsiFactory' @ [51:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [51:43] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'project' @ [51:60] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'invoke' @ [59:30] ==> public abstract operator fun invoke(): BindingContext defined in kotlin.Function0[FunctionInvokeDescriptor]

'MutableCodeToInline' @ [61:28] ==> public constructor MutableCodeToInline(mainExpression: KtExpression?, statementsBefore: MutableList<KtExpression>, fqNamesToImport: MutableCollection<FqName>) defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[ClassConstructorDescriptorImpl]

'mainExpression' @ [61:48] ==> value-parameter mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'statementsBefore' @ [61:64] ==> value-parameter statementsBefore: List<KtExpression> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'toMutableList' @ [61:81] ==> public fun <T> Collection<KtExpression>.toMutableList(): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'mutableSetOf' @ [61:98] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'bindingContext' @ [63:9] ==> var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'insertExplicitTypeArguments' @ [63:26] ==> private final fun insertExplicitTypeArguments(codeToInline: MutableCodeToInline, bindingContext: BindingContext, analyze: () -> BindingContext): BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'codeToInline' @ [63:54] ==> val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'bindingContext' @ [63:68] ==> var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'analyze' @ [63:84] ==> value-parameter analyze: () -> BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'processReferences' @ [65:9] ==> private final fun processReferences(codeToInline: MutableCodeToInline, bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'codeToInline' @ [65:27] ==> val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'bindingContext' @ [65:41] ==> var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'mainExpression' @ [67:13] ==> value-parameter mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'mainExpression' @ [68:45] ==> value-parameter mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'unpackFunctionLiteral' @ [68:60] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'functionLiteralExpression' @ [69:17] ==> val functionLiteralExpression: KtLambdaExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'getParametersForFunctionLiteral' @ [70:53] ==> private final fun getParametersForFunctionLiteral(functionLiteralExpression: KtLambdaExpression, context: BindingContext): String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'functionLiteralExpression' @ [70:85] ==> val functionLiteralExpression: KtLambdaExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'bindingContext' @ [70:112] ==> var bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'functionLiteralParameterTypes' @ [71:21] ==> val functionLiteralParameterTypes: String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'codeToInline' @ [72:21] ==> val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'addPostInsertionAction' @ [72:34] ==> public final fun <TElement : KtElement> addPostInsertionAction(element: KtExpression, action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtExpression

'mainExpression' @ [72:57] ==> value-parameter mainExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[ValueParameterDescriptorImpl]

'addFunctionLiteralParameterTypes' @ [73:25] ==> private final fun addFunctionLiteralParameterTypes(parameters: String, inlinedExpression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'functionLiteralParameterTypes' @ [73:58] ==> val functionLiteralParameterTypes: String? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'inlinedExpression' @ [73:89] ==> value-parameter inlinedExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline.<anonymous>[ValueParameterDescriptorImpl]

'codeToInline' @ [79:16] ==> val codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.prepareCodeToInline[LocalVariableDescriptor]

'toNonMutable' @ [79:29] ==> internal fun MutableCodeToInline.toNonMutable(): CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner in file MutableCodeToInline.kt[SimpleFunctionDescriptorImpl]

'context' @ [83:32] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral[ValueParameterDescriptorImpl]

'get' @ [83:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), p1: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> SimpleFunctionDescriptor

'FUNCTION' @ [83:59] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'functionLiteralExpression' @ [83:69] ==> value-parameter functionLiteralExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral[ValueParameterDescriptorImpl]

'functionLiteral' @ [83:95] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'lambdaDescriptor' @ [84:13] ==> val lambdaDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral[LocalVariableDescriptor]

'containsErrorType' @ [84:52] ==> public open fun containsErrorType(@NotNull p0: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'lambdaDescriptor' @ [84:70] ==> val lambdaDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral[LocalVariableDescriptor]

'lambdaDescriptor' @ [85:16] ==> val lambdaDescriptor: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral[LocalVariableDescriptor]

'valueParameters' @ [85:33] ==> public final val SimpleFunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinToString' @ [85:49] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [86:13] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:16] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'render' @ [86:21] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [86:39] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [86:62] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [86:74] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [86:85] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.getParametersForFunctionLiteral.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [86:88] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'inlinedExpression' @ [91:30] ==> value-parameter inlinedExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[ValueParameterDescriptorImpl]

'containingKtFile' @ [91:48] ==> public final val KtExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'containingFile' @ [92:32] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[LocalVariableDescriptor]

'getResolutionFacade' @ [92:47] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'inlinedExpression' @ [94:26] ==> value-parameter inlinedExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[ValueParameterDescriptorImpl]

'unpackFunctionLiteral' @ [94:44] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'sure' @ [94:72] ==> public inline fun <T : Any> KtLambdaExpression?.sure(message: () -> String): KtLambdaExpression defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtLambdaExpression

'+' @ [95:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'inlinedExpression' @ [95:61] ==> value-parameter inlinedExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[ValueParameterDescriptorImpl]

'text' @ [95:79] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'!' @ [97:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'needToAddParameterTypes' @ [97:14] ==> private final fun needToAddParameterTypes(lambdaExpression: KtLambdaExpression, resolutionFacade: ResolutionFacade): Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'lambdaExpr' @ [97:38] ==> val lambdaExpr: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[LocalVariableDescriptor]

'resolutionFacade' @ [97:50] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[LocalVariableDescriptor]

'SpecifyExplicitLambdaSignatureIntention' @ [98:9] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention[FakeCallableDescriptorForObject]

'applyWithParameters' @ [98:49] ==> public final fun applyWithParameters(element: KtLambdaExpression, parameterString: String): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyExplicitLambdaSignatureIntention.Companion[SimpleFunctionDescriptorImpl]

'lambdaExpr' @ [98:69] ==> val lambdaExpr: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[LocalVariableDescriptor]

'parameters' @ [98:81] ==> value-parameter parameters: String defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.addFunctionLiteralParameterTypes[ValueParameterDescriptorImpl]

'lambdaExpression' @ [105:31] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[ValueParameterDescriptorImpl]

'functionLiteral' @ [105:48] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'resolutionFacade' @ [106:23] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[ValueParameterDescriptorImpl]

'analyze' @ [106:40] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'lambdaExpression' @ [106:48] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[ValueParameterDescriptorImpl]

'PARTIAL_WITH_DIAGNOSTICS' @ [106:82] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [107:16] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[LocalVariableDescriptor]

'diagnostics' @ [107:24] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'any' @ [107:36] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostic' @ [108:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [108:38] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'diagnostic' @ [109:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [109:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'factory' @ [110:41] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'CANNOT_INFER_PARAMETER_TYPE' @ [110:59] ==> public final val CANNOT_INFER_PARAMETER_TYPE: (DiagnosticFactory0<(KtParameter..KtParameter?)>..DiagnosticFactory0<(KtParameter..KtParameter?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'element' @ [111:41] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'parent' @ [111:49] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [111:56] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'functionLiteral' @ [111:66] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[LocalVariableDescriptor]

'factory' @ [112:41] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'UNRESOLVED_REFERENCE' @ [112:59] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'element' @ [113:41] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'text' @ [113:49] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'element' @ [114:41] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'getStrictParentOfType' @ [114:49] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtFunctionLiteral? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunctionLiteral

'functionLiteral' @ [114:95] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes[LocalVariableDescriptor]

'hasCantInferParameter' @ [115:13] ==> val hasCantInferParameter: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'hasUnresolvedItOrThis' @ [115:38] ==> val hasUnresolvedItOrThis: Boolean defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.needToAddParameterTypes.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [120:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtCallExpression, KtTypeArgumentList>

'codeToInline' @ [121:9] ==> value-parameter codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [121:22] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.forEachDescendantOfType(noinline action: (KtCallExpression) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'InsertExplicitTypeArgumentsIntention' @ [122:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention[FakeCallableDescriptorForObject]

'isApplicableTo' @ [122:54] ==> public final fun isApplicableTo(element: KtCallElement, bindingContext: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [122:69] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [122:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[ValueParameterDescriptorImpl]

'typeArgsToAdd' @ [123:17] ==> val typeArgsToAdd: ArrayList<Pair<KtCallExpression, KtTypeArgumentList>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'add' @ [123:31] ==> public open fun add(element: Pair<KtCallExpression, KtTypeArgumentList>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [123:35] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'InsertExplicitTypeArgumentsIntention' @ [123:41] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention[FakeCallableDescriptorForObject]

'createTypeArguments' @ [123:78] ==> public final fun createTypeArguments(element: KtCallElement, bindingContext: BindingContext): KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.intentions.InsertExplicitTypeArgumentsIntention.Companion[SimpleFunctionDescriptorImpl]

'it' @ [123:98] ==> value-parameter it: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [123:102] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[ValueParameterDescriptorImpl]

'typeArgsToAdd' @ [127:13] ==> val typeArgsToAdd: ArrayList<Pair<KtCallExpression, KtTypeArgumentList>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'isEmpty' @ [127:27] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [127:45] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[ValueParameterDescriptorImpl]

'component1' @ [129:15] ==> public final operator fun component1(): KtCallExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [129:25] ==> public final operator fun component2(): KtTypeArgumentList defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'typeArgsToAdd' @ [129:38] ==> val typeArgsToAdd: ArrayList<Pair<KtCallExpression, KtTypeArgumentList>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'callExpr' @ [130:13] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'addAfter' @ [130:22] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'typeArgs' @ [130:31] ==> val typeArgs: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'callExpr' @ [130:41] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.insertExplicitTypeArguments[LocalVariableDescriptor]

'calleeExpression' @ [130:50] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'invoke' @ [134:16] ==> public abstract operator fun invoke(): BindingContext defined in kotlin.Function0[FunctionInvokeDescriptor]

'ArrayList' @ [138:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtExpression, KtExpression>

'codeToInline' @ [140:9] ==> value-parameter codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [140:22] ==> internal inline fun <reified T : PsiElement> MutableCodeToInline.forEachDescendantOfType(noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInliner[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'bindingContext' @ [141:26] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [141:56] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [141:74] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [144:17] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'mainReference' @ [144:28] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'canBeResolvedViaImport' @ [144:42] ==> public fun KtReference.canBeResolvedViaImport(target: DeclarationDescriptor, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'target' @ [144:65] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [144:73] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'codeToInline' @ [145:17] ==> value-parameter codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'fqNamesToImport' @ [145:30] ==> public final val fqNamesToImport: MutableCollection<FqName> defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[PropertyDescriptorImpl]

'add' @ [145:46] ==> public abstract fun add(element: FqName): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'target' @ [145:50] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'importableFqName' @ [145:57] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'expression' @ [148:17] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'getReceiverExpression' @ [148:28] ==> public fun KtSimpleNameExpression.getReceiverExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (target is ValueParameterDescriptor && target.containingDeclaration == targetCallable) {
                    expression.putCopyableUserData(CodeToInline.PARAMETER_USAGE_KEY, target.name)
                }
                else if (target is TypeParameterDescriptor && target.containingDeclaration == targetCallable) {
                    expression.putCopyableUserData(CodeToInline.TYPE_PARAMETER_USAGE_KEY, target.name)
                }' @ [149:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'target' @ [149:21] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'target' @ [149:59] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [149:66] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'targetCallable' @ [149:91] ==> private final val targetCallable: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'expression' @ [150:21] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [150:32] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Name..Name?)>..Key<(Name..Name?)>?), @Nullable p1: Name?): Unit defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Name

'CodeToInline' @ [150:52] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline[FakeCallableDescriptorForObject]

'PARAMETER_USAGE_KEY' @ [150:65] ==> public final val PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'target' @ [150:86] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'name' @ [150:93] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'target' @ [152:26] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'target' @ [152:63] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [152:70] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'targetCallable' @ [152:95] ==> private final val targetCallable: CallableDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'expression' @ [153:21] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [153:32] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(Name..Name?)>..Key<(Name..Name?)>?), @Nullable p1: Name?): Unit defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Name

'CodeToInline' @ [153:52] ==> public companion object defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline[FakeCallableDescriptorForObject]

'TYPE_PARAMETER_USAGE_KEY' @ [153:65] ==> public final val TYPE_PARAMETER_USAGE_KEY: Key<Name> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInline.Companion[PropertyDescriptorImpl]

'target' @ [153:91] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'name' @ [153:98] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'expression' @ [156:36] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [156:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [156:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'resolvedCall' @ [157:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [157:45] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'isReallySuccess' @ [157:58] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'if (resolvedCall.resultingDescriptor.isExtension)
                        resolvedCall.extensionReceiver
                    else
                        resolvedCall.dispatchReceiver' @ [158:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue?, elseBranch: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue?

'resolvedCall' @ [158:40] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [158:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'isExtension' @ [158:73] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolvedCall' @ [159:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'extensionReceiver' @ [159:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [161:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [161:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'receiver' @ [162:25] ==> val receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'expression' @ [163:47] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'getResolutionScope' @ [163:58] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [163:77] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'resolutionFacade' @ [163:93] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'receiver' @ [164:50] ==> val receiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'asExpression' @ [164:59] ==> public fun ImplicitReceiver.asExpression(resolutionScope: LexicalScope, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'resolutionScope' @ [164:72] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [164:89] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'receiverExpression' @ [165:29] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'receiversToAdd' @ [166:29] ==> val receiversToAdd: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'add' @ [166:44] ==> public open fun add(element: Pair<KtExpression, KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [166:48] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [166:62] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences.<anonymous>[LocalVariableDescriptor]

'component1' @ [174:15] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [174:21] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'receiversToAdd' @ [174:44] ==> val receiversToAdd: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'asReversed' @ [174:59] ==> @JvmName public fun <T> MutableList<Pair<KtExpression, KtExpression>>.asReversed(): MutableList<Pair<KtExpression, KtExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtExpression, KtExpression>

'expr' @ [175:39] ==> val expr: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'parent' @ [175:44] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expr' @ [175:75] ==> val expr: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'codeToInline' @ [176:13] ==> value-parameter codeToInline: MutableCodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[ValueParameterDescriptorImpl]

'replaceExpression' @ [176:26] ==> public final fun replaceExpression(oldExpression: KtExpression, newExpression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.MutableCodeToInline[SimpleFunctionDescriptorImpl]

'expressionToReplace' @ [176:44] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'psiFactory' @ [177:44] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[PropertyDescriptorImpl]

'createExpressionByPattern' @ [177:55] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [177:90] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

'expressionToReplace' @ [177:110] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder.processReferences[LocalVariableDescriptor]

