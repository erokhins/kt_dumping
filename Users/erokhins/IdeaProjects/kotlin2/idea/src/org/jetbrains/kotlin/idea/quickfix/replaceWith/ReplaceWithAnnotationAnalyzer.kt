'if (symbolDescriptor is CallableMemberDescriptor)
            DescriptorUtils.unwrapFakeOverride(symbolDescriptor)
        else
            symbolDescriptor' @ [53:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'symbolDescriptor' @ [53:39] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[ValueParameterDescriptorImpl]

'unwrapFakeOverride' @ [54:29] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> unwrapFakeOverride(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'symbolDescriptor' @ [54:48] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[ValueParameterDescriptorImpl]

'symbolDescriptor' @ [56:13] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[ValueParameterDescriptorImpl]

'original' @ [56:31] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'analyzeOriginal' @ [57:16] ==> private final fun analyzeOriginal(annotation: ReplaceWith, symbolDescriptor: CallableDescriptor, resolutionFacade: ResolutionFacade): CodeToInline? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'annotation' @ [57:32] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[ValueParameterDescriptorImpl]

'originalDescriptor' @ [57:44] ==> val originalDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[LocalVariableDescriptor]

'resolutionFacade' @ [57:64] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeCallableReplacement[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [65:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [65:39] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'project' @ [65:56] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'psiFactory' @ [67:13] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'createExpression' @ [67:24] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotation' @ [67:41] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'pattern' @ [67:52] ==> public final val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWith[PropertyDescriptorImpl]

'resolutionFacade' @ [73:22] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [73:39] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'buildExplicitImportsScope' @ [74:36] ==> private final fun buildExplicitImportsScope(annotation: ReplaceWith, resolutionFacade: ResolutionFacade, module: ModuleDescriptor): ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'annotation' @ [74:62] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'resolutionFacade' @ [74:74] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'module' @ [74:92] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'buildDefaultImportsScopes' @ [75:36] ==> private final fun buildDefaultImportsScopes(resolutionFacade: ResolutionFacade, module: ModuleDescriptor): List<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [75:62] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'module' @ [75:80] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'getResolutionScope' @ [76:21] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'symbolDescriptor' @ [76:40] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'symbolDescriptor' @ [76:58] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'listOf' @ [77:40] ==> public fun <T> listOf(element: ExplicitImportsScope): List<ExplicitImportsScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitImportsScope

'explicitImportsScope' @ [77:47] ==> val explicitImportsScope: ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'defaultImportsScopes' @ [77:71] ==> val defaultImportsScopes: List<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'resolutionFacade' @ [79:40] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'getFrontendService' @ [79:57] ==> public abstract fun <T : Any> getFrontendService(moduleDescriptor: ModuleDescriptor, serviceClass: Class<ExpressionTypingServices>): ExpressionTypingServices defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ExpressionTypingServices

'module' @ [79:76] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'ExpressionTypingServices' @ [79:84] ==> public constructor ExpressionTypingServices(@NotNull p0: ExpressionTypingComponents, @NotNull p1: AnnotationChecker, @NotNull p2: StatementFilter, @NotNull p3: ExpressionTypingVisitorDispatcher.ForDeclarations) defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaClassConstructorDescriptor]

'java' @ [79:116] ==> public val <T> KClass<ExpressionTypingServices>.java: Class<ExpressionTypingServices> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExpressionTypingServices

'expression' @ [81:35] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'analyzeInContext' @ [81:46] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [81:63] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'expressionTypingServices' @ [81:97] ==> val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'CodeToInlineBuilder' @ [83:16] ==> public constructor CodeToInlineBuilder(targetCallable: CallableDescriptor, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[ClassConstructorDescriptorImpl]

'symbolDescriptor' @ [83:36] ==> value-parameter symbolDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'resolutionFacade' @ [83:54] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[ValueParameterDescriptorImpl]

'prepareCodeToInline' @ [83:72] ==> public final fun prepareCodeToInline(mainExpression: KtExpression?, statementsBefore: List<KtExpression>, analyze: () -> BindingContext): CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [83:92] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[LocalVariableDescriptor]

'emptyList' @ [83:104] ==> public fun <T> emptyList(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'analyzeExpression' @ [83:119] ==> local final fun analyzeExpression(): BindingContext defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeOriginal[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [91:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [91:39] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'project' @ [91:56] ==> public abstract val project: Project defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'psiFactory' @ [93:13] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'createType' @ [93:24] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'annotation' @ [93:35] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'pattern' @ [93:46] ==> public final val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWith[PropertyDescriptorImpl]

'typeReference' @ [98:13] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'typeElement' @ [98:27] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'resolutionFacade' @ [100:22] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [100:39] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'buildExplicitImportsScope' @ [102:36] ==> private final fun buildExplicitImportsScope(annotation: ReplaceWith, resolutionFacade: ResolutionFacade, module: ModuleDescriptor): ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'annotation' @ [102:62] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'resolutionFacade' @ [102:74] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'module' @ [102:92] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'buildDefaultImportsScopes' @ [103:35] ==> private final fun buildDefaultImportsScopes(resolutionFacade: ResolutionFacade, module: ModuleDescriptor): List<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [103:61] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'module' @ [103:79] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'getResolutionScope' @ [104:21] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'symbolDescriptor' @ [104:40] ==> value-parameter symbolDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'symbolDescriptor' @ [104:58] ==> value-parameter symbolDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'listOf' @ [104:76] ==> public fun <T> listOf(element: ExplicitImportsScope): List<ExplicitImportsScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitImportsScope

'explicitImportsScope' @ [104:83] ==> val explicitImportsScope: ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'defaultImportScopes' @ [104:107] ==> val defaultImportScopes: List<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'resolutionFacade' @ [106:28] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[ValueParameterDescriptorImpl]

'getFrontendService' @ [106:45] ==> public abstract fun <T : Any> getFrontendService(serviceClass: Class<TypeResolver>): TypeResolver defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TypeResolver

'TypeResolver' @ [106:64] ==> public companion object defined in org.jetbrains.kotlin.resolve.TypeResolver[FakeCallableDescriptorForObject]

'java' @ [106:84] ==> public val <T> KClass<TypeResolver>.java: Class<TypeResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeResolver

'BindingTraceContext' @ [107:28] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'typeResolver' @ [108:9] ==> val typeResolver: TypeResolver defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'resolvePossiblyBareType' @ [108:22] ==> public final fun resolvePossiblyBareType(c: TypeResolutionContext, typeReference: KtTypeReference): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[DeserializedSimpleFunctionDescriptor]

'TypeResolutionContext' @ [108:46] ==> public constructor TypeResolutionContext(@NotNull p0: LexicalScope, @NotNull p1: BindingTrace, p2: Boolean, p3: Boolean, p4: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'scope' @ [108:68] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'bindingTrace' @ [108:75] ==> val bindingTrace: BindingTraceContext defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'typeReference' @ [108:110] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'ArrayList' @ [110:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtNameReferenceExpression, FqName>

'typeReference' @ [112:9] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'forEachDescendantOfType' @ [112:23] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtNameReferenceExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'expression' @ [113:30] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [113:41] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parentType' @ [114:17] ==> val parentType: KtUserType defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[LocalVariableDescriptor]

'qualifier' @ [114:28] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'bindingTrace' @ [115:31] ==> val bindingTrace: BindingTraceContext defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'bindingContext' @ [115:44] ==> public final val BindingTraceContext.bindingContext: BindingContext[MyPropertyDescriptor]

'REFERENCE_TARGET' @ [115:74] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [115:92] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[ValueParameterDescriptorImpl]

'targetClass' @ [116:26] ==> val targetClass: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[LocalVariableDescriptor]

'fqNameUnsafe' @ [116:38] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'fqName' @ [117:17] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[LocalVariableDescriptor]

'isSafe' @ [117:24] ==> public final val FqNameUnsafe.isSafe: Boolean[MyPropertyDescriptor]

'typesToQualify' @ [118:17] ==> val typesToQualify: ArrayList<Pair<KtNameReferenceExpression, FqName>> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'add' @ [118:32] ==> public open fun add(element: Pair<KtNameReferenceExpression, FqName>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [118:36] ==> value-parameter expression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [118:50] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement.<anonymous>[LocalVariableDescriptor]

'toSafe' @ [118:57] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'component1' @ [122:15] ==> public final operator fun component1(): KtNameReferenceExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [122:31] ==> public final operator fun component2(): FqName defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'typesToQualify' @ [122:42] ==> val typesToQualify: ArrayList<Pair<KtNameReferenceExpression, FqName>> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'nameExpression' @ [123:13] ==> val nameExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'mainReference' @ [123:28] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [123:42] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'fqName' @ [123:55] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'NO_SHORTENING' @ [123:100] ==> enum entry NO_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'typeReference' @ [126:16] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.analyzeClassifierReplacement[LocalVariableDescriptor]

'typeElement' @ [126:30] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'component1' @ [130:14] ==> public final operator fun component1(): List<ImportPath> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [130:31] ==> public final operator fun component2(): List<ImportPath> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [130:47] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[ValueParameterDescriptorImpl]

'frontendService' @ [130:64] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): DefaultImportProvider defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DefaultImportProvider

'defaultImports' @ [130:105] ==> public final val defaultImports: List<ImportPath> defined in org.jetbrains.kotlin.resolve.lazy.DefaultImportProvider[DeserializedPropertyDescriptor]

'partition' @ [130:120] ==> public inline fun <T> Iterable<ImportPath>.partition(predicate: (ImportPath) -> Boolean): Pair<List<ImportPath>, List<ImportPath>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'it' @ [130:132] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [130:135] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'listOf' @ [134:16] ==> public fun <T> listOf(element: ExplicitImportsScope): List<ExplicitImportsScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitImportsScope

'buildExplicitImportsScope' @ [134:23] ==> private final fun buildExplicitImportsScope(importFqNames: List<FqName>, resolutionFacade: ResolutionFacade, module: ModuleDescriptor): ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'aliasImports' @ [134:49] ==> val aliasImports: List<ImportPath> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[LocalVariableDescriptor]

'map' @ [134:62] ==> public inline fun <T, R> Iterable<ImportPath>.map(transform: (ImportPath) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R> -> FqName

'it' @ [134:68] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [134:71] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'resolutionFacade' @ [134:81] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[ValueParameterDescriptorImpl]

'module' @ [134:99] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[ValueParameterDescriptorImpl]

'allUnderImports' @ [135:16] ==> val allUnderImports: List<ImportPath> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[LocalVariableDescriptor]

'map' @ [135:32] ==> public inline fun <T, R> Iterable<ImportPath>.map(transform: (ImportPath) -> ImportingScope): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R> -> ImportingScope

'module' @ [135:38] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes[ValueParameterDescriptorImpl]

'getPackage' @ [135:45] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'it' @ [135:56] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildDefaultImportsScopes.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [135:59] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'memberScope' @ [135:67] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'memberScopeAsImportingScope' @ [135:79] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'asReversed' @ [135:111] ==> public fun <T> List<ImportingScope>.asReversed(): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportingScope

'buildExplicitImportsScope' @ [139:16] ==> private final fun buildExplicitImportsScope(importFqNames: List<FqName>, resolutionFacade: ResolutionFacade, module: ModuleDescriptor): ExplicitImportsScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'importFqNames' @ [139:42] ==> private final fun importFqNames(annotation: ReplaceWith): List<FqName> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'annotation' @ [139:56] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'resolutionFacade' @ [139:69] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'module' @ [139:87] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'importFqNames' @ [143:31] ==> value-parameter importFqNames: List<FqName> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'flatMap' @ [143:45] ==> public inline fun <T, R> Iterable<FqName>.flatMap(transform: (FqName) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> DeclarationDescriptor

'resolutionFacade' @ [143:55] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'resolveImportReference' @ [143:72] ==> public fun ResolutionFacade.resolveImportReference(moduleDescriptor: ModuleDescriptor, fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'module' @ [143:95] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[ValueParameterDescriptorImpl]

'it' @ [143:103] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope.<anonymous>[ValueParameterDescriptorImpl]

'ExplicitImportsScope' @ [144:16] ==> public constructor ExplicitImportsScope(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.resolve.scopes.ExplicitImportsScope[DeserializedClassConstructorDescriptor]

'importedSymbols' @ [144:37] ==> val importedSymbols: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.buildExplicitImportsScope[LocalVariableDescriptor]

'annotation' @ [148:16] ==> value-parameter annotation: ReplaceWith defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.importFqNames[ValueParameterDescriptorImpl]

'imports' @ [148:27] ==> public final val imports: List<String> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWith[PropertyDescriptorImpl]

'filter' @ [149:18] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'isValid' @ [149:40] ==> public open fun isValid(@Nullable p0: String?): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'it' @ [149:48] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.importFqNames.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [150:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqNameUnsafe): List<FqNameUnsafe> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqNameUnsafe

'FqNameUnsafe' @ [150:24] ==> public constructor FqNameUnsafe(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaClassConstructorDescriptor]

'filter' @ [151:18] ==> public inline fun <T> Iterable<FqNameUnsafe>.filter(predicate: (FqNameUnsafe) -> Boolean): List<FqNameUnsafe> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe

'isSafe' @ [151:39] ==> public open fun isSafe(): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'map' @ [152:18] ==> public inline fun <T, R> Iterable<FqNameUnsafe>.map(transform: (FqNameUnsafe) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqNameUnsafe
    <R> -> FqName

'toSafe' @ [152:36] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'when (descriptor) {
            is PackageFragmentDescriptor -> {
                val moduleDescriptor = descriptor.containingDeclaration
                getResolutionScope(moduleDescriptor.getPackage(descriptor.fqName), ownerDescriptor, additionalScopes)
            }

            is PackageViewDescriptor -> {
                LexicalScope.Base(
                        chainImportingScopes(listOf(descriptor.memberScope.memberScopeAsImportingScope()) + additionalScopes)!!,
                        ownerDescriptor)
            }

            is ClassDescriptor -> {
                val outerScope = getResolutionScope(descriptor.containingDeclaration, ownerDescriptor, additionalScopes) ?: return null
                ClassResolutionScopesSupport(descriptor, LockBasedStorageManager.NO_LOCKS, { outerScope }).scopeForMemberDeclarationResolution()
            }

            is TypeAliasDescriptor -> {
                val outerScope = getResolutionScope(descriptor.containingDeclaration, ownerDescriptor, additionalScopes) ?: return null
                LexicalScopeImpl(outerScope, descriptor, false, null, LexicalScopeKind.TYPE_ALIAS_HEADER, LocalRedeclarationChecker.DO_NOTHING) {
                    for (typeParameter in descriptor.declaredTypeParameters) {
                        addClassifierDescriptor(typeParameter)
                    }
                }
            }

            is FunctionDescriptor -> {
                val outerScope = getResolutionScope(descriptor.containingDeclaration, ownerDescriptor, additionalScopes) ?: return null
                FunctionDescriptorUtil.getFunctionInnerScope(outerScope, descriptor, LocalRedeclarationChecker.DO_NOTHING)
            }

            is PropertyDescriptor -> {
                val outerScope = getResolutionScope(descriptor.containingDeclaration, ownerDescriptor, additionalScopes) ?: return null
                val propertyHeader = ScopeUtils.makeScopeForPropertyHeader(outerScope, descriptor)
                LexicalScopeImpl(propertyHeader, descriptor, false, descriptor.extensionReceiverParameter, LexicalScopeKind.PROPERTY_ACCESSOR_BODY)
            }

            else -> return null // something local, should not work with ReplaceWith
        }' @ [156:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LexicalScope?, entry1: LexicalScope?, entry2: LexicalScope?, entry3: LexicalScope?, entry4: LexicalScope?, entry5: LexicalScope?, entry6: LexicalScope?): LexicalScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LexicalScope?

'descriptor' @ [156:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'descriptor' @ [158:40] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [158:51] ==> public final val PackageFragmentDescriptor.containingDeclaration: ModuleDescriptor[MyPropertyDescriptor]

'getResolutionScope' @ [159:17] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [159:36] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'getPackage' @ [159:53] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [159:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'fqName' @ [159:75] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'ownerDescriptor' @ [159:84] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'additionalScopes' @ [159:101] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'Base' @ [163:30] ==> public constructor Base(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope.Base[DeserializedClassConstructorDescriptor]

'chainImportingScopes' @ [164:25] ==> public fun chainImportingScopes(scopes: List<ImportingScope>, tail: ImportingScope? = ...): ImportingScope? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'listOf' @ [164:46] ==> public fun <T> listOf(element: ImportingScope): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportingScope

'descriptor' @ [164:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'memberScope' @ [164:64] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'memberScopeAsImportingScope' @ [164:76] ==> @JvmOverloads public fun MemberScope.memberScopeAsImportingScope(parentScope: ImportingScope? = ...): ImportingScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'additionalScopes' @ [164:109] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [165:25] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'getResolutionScope' @ [169:34] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'descriptor' @ [169:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [169:64] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownerDescriptor' @ [169:87] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'additionalScopes' @ [169:104] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'ClassResolutionScopesSupport' @ [170:17] ==> public constructor ClassResolutionScopesSupport(classDescriptor: ClassDescriptor, storageManager: StorageManager, getOuterScope: () -> LexicalScope) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.ClassResolutionScopesSupport[DeserializedClassConstructorDescriptor]

'descriptor' @ [170:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'NO_LOCKS' @ [170:82] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'outerScope' @ [170:94] ==> val outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'invoke' @ [170:108] ==> public abstract operator fun invoke(): LexicalScope defined in kotlin.Function0[FunctionInvokeDescriptor]

'getResolutionScope' @ [174:34] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'descriptor' @ [174:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [174:64] ==> public final val TypeAliasDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownerDescriptor' @ [174:87] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'additionalScopes' @ [174:104] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'LexicalScopeImpl' @ [175:17] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'outerScope' @ [175:34] ==> val outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'descriptor' @ [175:46] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'TYPE_ALIAS_HEADER' @ [175:88] ==> enum entry TYPE_ALIAS_HEADER defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [175:133] ==> public object DO_NOTHING : LocalRedeclarationChecker defined in org.jetbrains.kotlin.resolve.scopes.LocalRedeclarationChecker[FakeCallableDescriptorForObject]

'descriptor' @ [176:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [176:54] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'addClassifierDescriptor' @ [177:25] ==> public final fun addClassifierDescriptor(classifierDescriptor: ClassifierDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl.InitializeHandler[DeserializedSimpleFunctionDescriptor]

'typeParameter' @ [177:49] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope.<anonymous>[LocalVariableDescriptor]

'getResolutionScope' @ [183:34] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'descriptor' @ [183:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [183:64] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownerDescriptor' @ [183:87] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'additionalScopes' @ [183:104] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'getFunctionInnerScope' @ [184:40] ==> @NotNull public open fun getFunctionInnerScope(@NotNull p0: LexicalScope, @NotNull p1: FunctionDescriptor, @NotNull p2: LocalRedeclarationChecker): LexicalScope defined in org.jetbrains.kotlin.resolve.FunctionDescriptorUtil[JavaMethodDescriptor]

'outerScope' @ [184:62] ==> val outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'descriptor' @ [184:74] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'DO_NOTHING' @ [184:112] ==> public object DO_NOTHING : LocalRedeclarationChecker defined in org.jetbrains.kotlin.resolve.scopes.LocalRedeclarationChecker[FakeCallableDescriptorForObject]

'getResolutionScope' @ [188:34] ==> private final fun getResolutionScope(descriptor: DeclarationDescriptor, ownerDescriptor: DeclarationDescriptor, additionalScopes: Collection<ImportingScope>): LexicalScope? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer[SimpleFunctionDescriptorImpl]

'descriptor' @ [188:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'containingDeclaration' @ [188:64] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ownerDescriptor' @ [188:87] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'additionalScopes' @ [188:104] ==> value-parameter additionalScopes: Collection<ImportingScope> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'makeScopeForPropertyHeader' @ [189:49] ==> public open fun makeScopeForPropertyHeader(@NotNull p0: LexicalScope, @NotNull p1: PropertyDescriptor): (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.resolve.scopes.ScopeUtils[JavaMethodDescriptor]

'outerScope' @ [189:76] ==> val outerScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'descriptor' @ [189:88] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'LexicalScopeImpl' @ [190:17] ==> @JvmOverloads public constructor LexicalScopeImpl(parent: HierarchicalScope, ownerDescriptor: DeclarationDescriptor, isOwnerDescriptorAccessibleByLabel: Boolean, implicitReceiver: ReceiverParameterDescriptor?, kind: LexicalScopeKind, redeclarationChecker: LocalRedeclarationChecker = ..., initialize: LexicalScopeImpl.InitializeHandler.() -> Unit = ...) defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeImpl[DeserializedClassConstructorDescriptor]

'propertyHeader' @ [190:34] ==> val propertyHeader: (LexicalScope..LexicalScope?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[LocalVariableDescriptor]

'descriptor' @ [190:50] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'descriptor' @ [190:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceWithAnnotationAnalyzer.getResolutionScope[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [190:80] ==> public final val PropertyDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'PROPERTY_ACCESSOR_BODY' @ [190:125] ==> enum entry PROPERTY_ACCESSOR_BODY defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

