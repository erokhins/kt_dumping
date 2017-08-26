'Inject' @ [46:9] ==> public constructor Inject() defined in javax.inject.Inject[JavaClassConstructorDescriptor]

'codeFragment' @ [49:35] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'getContentElement' @ [49:48] ==> public abstract fun getContentElement(): KtElement? defined in org.jetbrains.kotlin.psi.KtCodeFragment[DeserializedSimpleFunctionDescriptor]

'component1' @ [51:14] ==> public final operator fun component1(): LexicalScope defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [51:38] ==> public final operator fun component2(): DataFlowInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getScopeAndDataFlowForAnalyzeFragment' @ [51:54] ==> private final fun getScopeAndDataFlowForAnalyzeFragment(codeFragment: KtCodeFragment, resolveToElement: (KtElement) -> BindingContext): Pair<LexicalScope, DataFlowInfo>? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[SimpleFunctionDescriptorImpl]

'codeFragment' @ [51:92] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'resolveElementCache' @ [52:13] ==> public final var resolveElementCache: ResolveElementCache? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'resolveToElements' @ [52:35] ==> public final fun resolveToElements(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.project.ResolveElementCache[SimpleFunctionDescriptorImpl]

'listOf' @ [52:53] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [52:60] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment.<anonymous>[ValueParameterDescriptorImpl]

'bodyResolveMode' @ [52:65] ==> value-parameter bodyResolveMode: BodyResolveMode defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'when (codeFragmentElement) {
            is KtExpression -> {
                PreliminaryDeclarationVisitor.createForExpression(codeFragmentElement, trace,
                                                                  expressionTypingServices.languageVersionSettings)
                expressionTypingServices.getTypeInfo(
                        scopeForContextElement,
                        codeFragmentElement,
                        TypeUtils.NO_EXPECTED_TYPE,
                        dataFlowInfo,
                        trace,
                        false
                )
            }

            is KtTypeReference -> {
                val context = TypeResolutionContext(scopeForContextElement, trace, true, true, codeFragment.suppressDiagnosticsInDebugMode()).noBareTypes()
                typeResolver.resolvePossiblyBareType(context, codeFragmentElement)
            }
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'codeFragmentElement' @ [55:15] ==> val codeFragmentElement: KtElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'PreliminaryDeclarationVisitor' @ [57:17] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor[FakeCallableDescriptorForObject]

'createForExpression' @ [57:47] ==> public final fun createForExpression(expression: KtExpression, trace: BindingTrace, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.types.expressions.PreliminaryDeclarationVisitor.Companion[DeserializedSimpleFunctionDescriptor]

'codeFragmentElement' @ [57:67] ==> val codeFragmentElement: KtElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'trace' @ [57:88] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'expressionTypingServices' @ [58:67] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'languageVersionSettings' @ [58:92] ==> public final val ExpressionTypingServices.languageVersionSettings: LanguageVersionSettings[MyPropertyDescriptor]

'expressionTypingServices' @ [59:17] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'getTypeInfo' @ [59:42] ==> @NotNull public open fun getTypeInfo(@NotNull p0: LexicalScope, @NotNull p1: KtExpression, @NotNull p2: KotlinType, @NotNull p3: DataFlowInfo, @NotNull p4: BindingTrace, p5: Boolean): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'scopeForContextElement' @ [60:25] ==> val scopeForContextElement: LexicalScope defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'codeFragmentElement' @ [61:25] ==> val codeFragmentElement: KtElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'NO_EXPECTED_TYPE' @ [62:35] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'dataFlowInfo' @ [63:25] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'trace' @ [64:25] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'TypeResolutionContext' @ [70:31] ==> public constructor TypeResolutionContext(@NotNull p0: LexicalScope, @NotNull p1: BindingTrace, p2: Boolean, p3: Boolean, p4: Boolean) defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaClassConstructorDescriptor]

'scopeForContextElement' @ [70:53] ==> val scopeForContextElement: LexicalScope defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'trace' @ [70:77] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'codeFragment' @ [70:96] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[ValueParameterDescriptorImpl]

'suppressDiagnosticsInDebugMode' @ [70:109] ==> public fun KtElement.suppressDiagnosticsInDebugMode(): Boolean defined in org.jetbrains.kotlin.psi.codeFragmentUtil[DeserializedSimpleFunctionDescriptor]

'noBareTypes' @ [70:143] ==> @NotNull public open fun noBareTypes(): TypeResolutionContext defined in org.jetbrains.kotlin.resolve.TypeResolutionContext[JavaMethodDescriptor]

'typeResolver' @ [71:17] ==> private final val typeResolver: TypeResolver defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'resolvePossiblyBareType' @ [71:30] ==> public final fun resolvePossiblyBareType(c: TypeResolutionContext, typeReference: KtTypeReference): PossiblyBareType defined in org.jetbrains.kotlin.resolve.TypeResolver[DeserializedSimpleFunctionDescriptor]

'context' @ [71:54] ==> val context: TypeResolutionContext defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'codeFragmentElement' @ [71:63] ==> val codeFragmentElement: KtElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.analyzeCodeFragment[LocalVariableDescriptor]

'when (this) {
                   is KtProperty -> this.delegateExpressionOrInitializer
                   is KtFunctionLiteral -> this.bodyExpression?.statements?.lastOrNull()
                   is KtDeclarationWithBody -> this.bodyExpression
                   is KtBlockExpression -> this.statements.lastOrNull()
                   else -> null
               }' @ [78:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?, entry4: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'this' @ [78:22] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'this' @ [79:37] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'delegateExpressionOrInitializer' @ [79:42] ==> public final val KtProperty.delegateExpressionOrInitializer: KtExpression?[MyPropertyDescriptor]

'this' @ [80:44] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [80:49] ==> public final val KtFunctionLiteral.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'statements' @ [80:65] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [80:77] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'this' @ [81:48] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [81:53] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [82:44] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'statements' @ [82:49] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'lastOrNull' @ [82:60] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'this' @ [84:21] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.correctContextForElement[ReceiverParameterDescriptorImpl]

'codeFragment' @ [91:23] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[ValueParameterDescriptorImpl]

'context' @ [91:36] ==> public final val KtCodeFragment.context: PsiElement?[MyPropertyDescriptor]

'!' @ [97:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [97:28] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'classOrObject' @ [97:36] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment.getClassDescriptor[ValueParameterDescriptorImpl]

'resolveSession' @ [98:24] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'getClassDescriptor' @ [98:39] ==> @NotNull public open fun getClassDescriptor(@NotNull p0: KtClassOrObject, @NotNull p1: LookupLocation): ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaMethodDescriptor]

'classOrObject' @ [98:58] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment.getClassDescriptor[ValueParameterDescriptorImpl]

'FROM_IDE' @ [98:90] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'invoke' @ [101:20] ==> public abstract operator fun invoke(p1: KtElement): BindingContext defined in kotlin.Function1[FunctionInvokeDescriptor]

'classOrObject' @ [101:37] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment.getClassDescriptor[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [101:67] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [101:94] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment.getClassDescriptor[ValueParameterDescriptorImpl]

'when (context) {
            is KtPrimaryConstructor -> {
                val descriptor = (getClassDescriptor(context.getContainingClassOrObject()) as? ClassDescriptorWithResolutionScopes) ?: return null

                scopeForContextElement = descriptor.scopeForInitializerResolution
                dataFlowInfo = DataFlowInfo.EMPTY
            }
            is KtSecondaryConstructor -> {
                val correctedContext = context.getDelegationCall().calleeExpression!!

                val contextForElement = resolveToElement(correctedContext)

                scopeForContextElement = contextForElement[BindingContext.LEXICAL_SCOPE, correctedContext]
                dataFlowInfo = DataFlowInfo.EMPTY
            }
            is KtClassOrObject -> {
                val descriptor = (getClassDescriptor(context) as? ClassDescriptorWithResolutionScopes) ?: return null

                scopeForContextElement = descriptor.scopeForMemberDeclarationResolution
                dataFlowInfo = DataFlowInfo.EMPTY
            }
            is KtFile -> {
                scopeForContextElement = resolveSession.fileScopeProvider.getFileResolutionScope(context)
                dataFlowInfo = DataFlowInfo.EMPTY
            }
            is KtElement -> {
                val correctedContext = context.correctContextForElement()

                val contextForElement = resolveToElement(correctedContext)

                scopeForContextElement = contextForElement[BindingContext.LEXICAL_SCOPE, correctedContext]
                dataFlowInfo = contextForElement.getDataFlowInfoAfter(correctedContext)
            }
            else -> return null
        }' @ [104:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'context' @ [104:15] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'?:' @ [106:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptorWithResolutionScopes?, right: ClassDescriptorWithResolutionScopes): ClassDescriptorWithResolutionScopes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptorWithResolutionScopes

'getClassDescriptor' @ [106:35] ==> local final fun getClassDescriptor(classOrObject: KtClassOrObject): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[SimpleFunctionDescriptorImpl]

'context' @ [106:54] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'getContainingClassOrObject' @ [106:62] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'scopeForContextElement' @ [108:17] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'descriptor' @ [108:42] ==> val descriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForInitializerResolution' @ [108:53] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'dataFlowInfo' @ [109:17] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'DataFlowInfo' @ [109:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [109:45] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'context' @ [112:40] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'getDelegationCall' @ [112:48] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'calleeExpression' @ [112:68] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'invoke' @ [114:41] ==> public abstract operator fun invoke(p1: KtElement): BindingContext defined in kotlin.Function1[FunctionInvokeDescriptor]

'correctedContext' @ [114:58] ==> val correctedContext: KtConstructorDelegationReferenceExpression defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForContextElement' @ [116:17] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'contextForElement' @ [116:42] ==> val contextForElement: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'LEXICAL_SCOPE' @ [116:75] ==> public final val LEXICAL_SCOPE: (WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>..WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'correctedContext' @ [116:90] ==> val correctedContext: KtConstructorDelegationReferenceExpression defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'dataFlowInfo' @ [117:17] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'DataFlowInfo' @ [117:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [117:45] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'?:' @ [120:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptorWithResolutionScopes?, right: ClassDescriptorWithResolutionScopes): ClassDescriptorWithResolutionScopes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptorWithResolutionScopes

'getClassDescriptor' @ [120:35] ==> local final fun getClassDescriptor(classOrObject: KtClassOrObject): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[SimpleFunctionDescriptorImpl]

'context' @ [120:54] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForContextElement' @ [122:17] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'descriptor' @ [122:42] ==> val descriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForMemberDeclarationResolution' @ [122:53] ==> public final val ClassDescriptorWithResolutionScopes.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'dataFlowInfo' @ [123:17] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'DataFlowInfo' @ [123:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [123:45] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'scopeForContextElement' @ [126:17] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'resolveSession' @ [126:42] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'fileScopeProvider' @ [126:57] ==> public final var ResolveSession.fileScopeProvider: FileScopeProvider[MyPropertyDescriptor]

'getFileResolutionScope' @ [126:75] ==> public open fun getFileResolutionScope(file: KtFile): LexicalScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopeProvider[DeserializedSimpleFunctionDescriptor]

'context' @ [126:98] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'dataFlowInfo' @ [127:17] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'DataFlowInfo' @ [127:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [127:45] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'context' @ [130:40] ==> val context: PsiElement? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'correctContextForElement' @ [130:48] ==> private final fun KtElement.correctContextForElement(): KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[SimpleFunctionDescriptorImpl]

'invoke' @ [132:41] ==> public abstract operator fun invoke(p1: KtElement): BindingContext defined in kotlin.Function1[FunctionInvokeDescriptor]

'correctedContext' @ [132:58] ==> val correctedContext: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForContextElement' @ [134:17] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'contextForElement' @ [134:42] ==> val contextForElement: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'LEXICAL_SCOPE' @ [134:75] ==> public final val LEXICAL_SCOPE: (WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>..WritableSlice<(KtElement..KtElement?), (LexicalScope..LexicalScope?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'correctedContext' @ [134:90] ==> val correctedContext: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'dataFlowInfo' @ [135:17] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'contextForElement' @ [135:32] ==> val contextForElement: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'getDataFlowInfoAfter' @ [135:50] ==> public fun BindingContext.getDataFlowInfoAfter(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'correctedContext' @ [135:71] ==> val correctedContext: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'scopeForContextElement' @ [140:13] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'codeFragment' @ [142:26] ==> value-parameter codeFragment: KtCodeFragment defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[ValueParameterDescriptorImpl]

'importsAsImportList' @ [142:39] ==> public final fun importsAsImportList(): KtImportList? defined in org.jetbrains.kotlin.psi.KtCodeFragment[DeserializedSimpleFunctionDescriptor]

'importList' @ [143:13] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'importList' @ [143:35] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'imports' @ [143:46] ==> public final val KtImportList.imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'isEmpty' @ [143:54] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'scopeForContextElement' @ [144:20] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'dataFlowInfo' @ [144:46] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'importList' @ [147:28] ==> val importList: KtImportList? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'imports' @ [147:39] ==> public final val KtImportList.imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'mapNotNull' @ [147:47] ==> public inline fun <T, R : Any> Iterable<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> ImportingScope?): List<ImportingScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> ImportingScope

'qualifierResolver' @ [148:13] ==> private final val qualifierResolver: QualifiedExpressionResolver defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'processImportReference' @ [148:31] ==> public final fun processImportReference(importDirective: KtImportDirective, moduleDescriptor: ModuleDescriptor, trace: BindingTrace, excludedImportNames: Collection<FqName>, packageFragmentForVisibilityCheck: PackageFragmentDescriptor?): ImportingScope? defined in org.jetbrains.kotlin.resolve.QualifiedExpressionResolver[DeserializedSimpleFunctionDescriptor]

'it' @ [148:54] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment.<anonymous>[ValueParameterDescriptorImpl]

'resolveSession' @ [148:58] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'moduleDescriptor' @ [148:73] ==> public open val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'resolveSession' @ [148:91] ==> private final val resolveSession: ResolveSession defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer[PropertyDescriptorImpl]

'trace' @ [148:106] ==> public open val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.ResolveSession[JavaPropertyDescriptor]

'emptyList' @ [149:76] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'scopeForContextElement' @ [152:16] ==> val scopeForContextElement: LexicalScope? defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'addImportingScopes' @ [152:39] ==> public fun LexicalScope.addImportingScopes(importScopes: List<ImportingScope>): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'importScopes' @ [152:58] ==> val importScopes: List<ImportingScope> defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

'dataFlowInfo' @ [152:75] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.caches.resolve.CodeFragmentAnalyzer.getScopeAndDataFlowForAnalyzeFragment[LocalVariableDescriptor]

