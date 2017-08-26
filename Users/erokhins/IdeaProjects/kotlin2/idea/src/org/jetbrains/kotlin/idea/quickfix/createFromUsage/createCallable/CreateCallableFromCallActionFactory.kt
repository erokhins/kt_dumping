'CreateCallableMemberFromUsageFactory<E>' @ [57:5] ==> public constructor CreateCallableMemberFromUsageFactory<E : KtElement>(extensionsSupported: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableMemberFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'extensionsEnabled' @ [57:45] ==> value-parameter extensionsEnabled: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.<init>[ValueParameterDescriptorImpl]

'diagnostic' @ [67:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [67:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'!=' @ [68:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtElementImplStub[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [68:25] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtElementImplStub<out (StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>..StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>?)>..KtElementImplStub<out (StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>..StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>?)>?)>..Class<out (KtElementImplStub<out (StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>..StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>?)>..KtElementImplStub<out (StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>..StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>?)>?)>?)): KtElementImplStub<out (StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>..StubElement<out KtElementImplStub<out (StubElement<out KtElementImplStub<*>>..StubElement<out KtElementImplStub<*>>?)>>?)>? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>?)>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>?)>>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>?)>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>..com.intellij.psi.stubs.StubElement<out org.jetbrains.kotlin.psi.KtElementImplStub<*>>?)>>?)>?)

'diagElement' @ [69:17] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'java' @ [70:40] ==> public val <T> KClass<KtTypeReference>.java: Class<KtTypeReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTypeReference

'java' @ [70:71] ==> public val <T> KClass<KtAnnotationEntry>.java: Class<KtAnnotationEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'java' @ [70:102] ==> public val <T> KClass<KtImportDirective>.java: Class<KtImportDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtImportDirective

'when (diagnostic.factory) {
            in Errors.UNRESOLVED_REFERENCE_DIAGNOSTICS, Errors.EXPRESSION_EXPECTED_PACKAGE_FOUND -> {
                val parent = diagElement.parent
                if (parent is KtCallExpression && parent.calleeExpression == diagElement) parent else diagElement
            }

            Errors.NO_VALUE_FOR_PARAMETER,
            Errors.TOO_MANY_ARGUMENTS,
            Errors.NONE_APPLICABLE -> diagElement.getNonStrictParentOfType<KtCallExpression>()

            Errors.TYPE_MISMATCH -> (diagElement.parent as? KtValueArgument)?.getStrictParentOfType<KtCallExpression>()

            else -> throw AssertionError("Unexpected diagnostic: ${diagnostic.factory}")
        }' @ [73:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'diagnostic' @ [73:22] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[ValueParameterDescriptorImpl]

'factory' @ [73:33] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'in' @ [74:13] ==> public operator fun <@OnlyInputTypes T> Iterable<(DiagnosticFactory<*>..DiagnosticFactory<*>?)>.contains(element: (DiagnosticFactory<*>..DiagnosticFactory<*>?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory<*>?)

'UNRESOLVED_REFERENCE_DIAGNOSTICS' @ [74:23] ==> public final val UNRESOLVED_REFERENCE_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'EXPRESSION_EXPECTED_PACKAGE_FOUND' @ [74:64] ==> public final val EXPRESSION_EXPECTED_PACKAGE_FOUND: (DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>..DiagnosticFactory0<(KtSimpleNameExpression..KtSimpleNameExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagElement' @ [75:30] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'parent' @ [75:42] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtCallExpression && parent.calleeExpression == diagElement) parent else diagElement' @ [76:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'parent' @ [76:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'parent' @ [76:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'calleeExpression' @ [76:58] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'diagElement' @ [76:78] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'parent' @ [76:91] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'diagElement' @ [76:103] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'NO_VALUE_FOR_PARAMETER' @ [79:20] ==> public final val NO_VALUE_FOR_PARAMETER: (DiagnosticFactory1<(KtElement..KtElement?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory1<(KtElement..KtElement?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TOO_MANY_ARGUMENTS' @ [80:20] ==> public final val TOO_MANY_ARGUMENTS: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NONE_APPLICABLE' @ [81:20] ==> public final val NONE_APPLICABLE: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagElement' @ [81:39] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [81:51] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'TYPE_MISMATCH' @ [83:20] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagElement' @ [83:38] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[LocalVariableDescriptor]

'parent' @ [83:50] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getStrictParentOfType' @ [83:79] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'AssertionError' @ [85:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'diagnostic' @ [85:68] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getExpressionOfInterest[ValueParameterDescriptorImpl]

'factory' @ [85:79] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'element' @ [90:23] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'project' @ [90:31] ==> public final val KtExpression.project: Project[MyPropertyDescriptor]

'when (element) {
                             is KtCallExpression -> element.calleeExpression
                             is KtSimpleNameExpression -> element
                             else -> null
                         }' @ [92:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'element' @ [92:32] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'element' @ [93:53] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'calleeExpression' @ [93:61] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [94:59] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'calleeExpr' @ [98:13] ==> val calleeExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'getReferencedNameElementType' @ [98:24] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'IDENTIFIER' @ [98:67] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'calleeExpr' @ [100:30] ==> val calleeExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'analyzeAndGetResult' @ [100:41] ==> public fun KtElement.analyzeAndGetResult(): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [101:24] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'getCall' @ [101:32] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [101:40] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'bindingContext' @ [101:55] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'explicitReceiver' @ [101:72] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'getReceiverTypeInfo' @ [102:28] ==> private final fun getReceiverTypeInfo(context: BindingContext, project: Project, receiver: Receiver?): TypeInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[SimpleFunctionDescriptorImpl]

'analysisResult' @ [102:48] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'bindingContext' @ [102:63] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'project' @ [102:79] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'receiver' @ [102:88] ==> val receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'if (receiverType is TypeInfo.Empty) {
                    val containers = with(element.getQualifiedExpressionForSelectorOrThis().getExtractionContainers()) {
                        if (element is KtCallExpression) this else filter { it is KtClassBody || it is KtFile }
                    }
                    if (containers.isNotEmpty()) containers else return null
                }
                else Collections.emptyList()' @ [105:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtElement>, elseBranch: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtElement>

'receiverType' @ [105:21] ==> val receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'with' @ [106:38] ==> @InlineOnly public inline fun <T, R> with(receiver: List<KtElement>, block: List<KtElement>.() -> List<KtElement>): List<KtElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtElement>
    <R> -> List<KtElement>

'element' @ [106:43] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [106:51] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getExtractionContainers' @ [106:93] ==> public fun PsiElement.getExtractionContainers(strict: Boolean = ..., includeAll: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'if (element is KtCallExpression) this else filter { it is KtClassBody || it is KtFile }' @ [107:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtElement>, elseBranch: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtElement>

'element' @ [107:29] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'this' @ [107:58] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo.<anonymous>[ReceiverParameterDescriptorImpl]

'filter' @ [107:68] ==> public inline fun <T> Iterable<KtElement>.filter(predicate: (KtElement) -> Boolean): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [107:77] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [107:98] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (containers.isNotEmpty()) containers else return null' @ [109:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtElement>, elseBranch: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtElement>

'containers' @ [109:25] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'isNotEmpty' @ [109:36] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'containers' @ [109:50] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'emptyList' @ [111:34] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtElement..KtElement?)>..List<(KtElement..KtElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)

'doCreateCallableInfo' @ [113:16] ==> protected abstract fun doCreateCallableInfo(expression: E, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [113:37] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [113:46] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'calleeExpr' @ [113:62] ==> val calleeExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'getReferencedName' @ [113:73] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [113:94] ==> val receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'possibleContainers' @ [113:108] ==> val possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.createCallableInfo[LocalVariableDescriptor]

'when (receiver) {
            null -> TypeInfo.Empty
            is Qualifier -> {
                val qualifierType = context.getType(receiver.expression)
                if (qualifierType != null) return TypeInfo(qualifierType, Variance.IN_VARIANCE)

                if (receiver !is ClassQualifier) return null
                val classifierType = receiver.descriptor.classValueType
                if (classifierType != null) return TypeInfo(classifierType, Variance.IN_VARIANCE)

                val javaClassifier = receiver.descriptor as? JavaClassDescriptor ?: return null
                val javaClass = DescriptorToSourceUtilsIde.getAnyDeclaration(project, javaClassifier) as? PsiClass
                if (javaClass == null || !javaClass.canRefactor()) return null
                TypeInfo.StaticContextRequired(TypeInfo(javaClassifier.defaultType, Variance.IN_VARIANCE))
            }
            is ReceiverValue -> TypeInfo(receiver.type, Variance.IN_VARIANCE)
            else -> throw AssertionError("Unexpected receiver: $receiver")
        }' @ [117:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeInfo?, entry1: TypeInfo?, entry2: TypeInfo?, entry3: TypeInfo?): TypeInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeInfo?

'receiver' @ [117:22] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'Empty' @ [118:30] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'context' @ [120:37] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'getType' @ [120:45] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'receiver' @ [120:53] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'expression' @ [120:62] ==> public val Qualifier.expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers[DeserializedPropertyDescriptor]

'qualifierType' @ [121:21] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'TypeInfo' @ [121:51] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'qualifierType' @ [121:60] ==> val qualifierType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [121:84] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'receiver' @ [123:21] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'receiver' @ [124:38] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'descriptor' @ [124:47] ==> public open val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassQualifier[DeserializedPropertyDescriptor]

'classValueType' @ [124:58] ==> public val ClassDescriptor.classValueType: KotlinType? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'classifierType' @ [125:21] ==> val classifierType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'TypeInfo' @ [125:52] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'classifierType' @ [125:61] ==> val classifierType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'IN_VARIANCE' @ [125:86] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'receiver' @ [127:38] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'descriptor' @ [127:47] ==> public open val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassQualifier[DeserializedPropertyDescriptor]

'DescriptorToSourceUtilsIde' @ [128:33] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [128:60] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [128:78] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'javaClassifier' @ [128:87] ==> val javaClassifier: JavaClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'javaClass' @ [129:21] ==> val javaClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'!' @ [129:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [129:43] ==> val javaClass: PsiClass? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'canRefactor' @ [129:53] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'StaticContextRequired' @ [130:26] ==> public constructor StaticContextRequired(delegate: TypeInfo) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.StaticContextRequired[ClassConstructorDescriptorImpl]

'TypeInfo' @ [130:48] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'javaClassifier' @ [130:57] ==> val javaClassifier: JavaClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[LocalVariableDescriptor]

'defaultType' @ [130:72] ==> public final val JavaClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'IN_VARIANCE' @ [130:94] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [132:33] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [132:42] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'type' @ [132:51] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'IN_VARIANCE' @ [132:66] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'AssertionError' @ [133:27] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'receiver' @ [133:65] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getReceiverTypeInfo[ValueParameterDescriptorImpl]

'mainCallable' @ [141:32] ==> value-parameter mainCallable: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[ValueParameterDescriptorImpl]

'receiverTypeInfo' @ [141:45] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[PropertyDescriptorImpl]

'if (receiverTypeInfo != TypeInfo.Empty) {
            if (receiverTypeInfo !is TypeInfo.ByType) return null
            receiverType = receiverTypeInfo.theType
            containingClass = receiverType.constructor.declarationDescriptor?.source?.getPsi() as? KtClass ?: return null
        }
        else {
            containingClass = originalExpression.getStrictParentOfType<KtClassOrObject>() as? KtClass ?: return null
            if (containingClass is KtEnumEntry) return null
            receiverType = (containingClass.resolveToDescriptor() as ClassDescriptor).defaultType
        }' @ [142:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverTypeInfo' @ [142:13] ==> val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'Empty' @ [142:42] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'receiverTypeInfo' @ [143:17] ==> val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'receiverType' @ [144:13] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'receiverTypeInfo' @ [144:28] ==> val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'theType' @ [144:45] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo.ByType[PropertyDescriptorImpl]

'containingClass' @ [145:13] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'receiverType' @ [145:31] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'constructor' @ [145:44] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [145:56] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'source' @ [145:79] ==> public final val ClassifierDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [145:87] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [148:13] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'originalExpression' @ [148:31] ==> value-parameter originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [148:50] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'containingClass' @ [149:17] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'receiverType' @ [150:13] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'containingClass' @ [150:29] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'resolveToDescriptor' @ [150:45] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'defaultType' @ [150:87] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'!' @ [153:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [153:14] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'isAbstract' @ [153:27] ==> public fun KotlinType.isAbstract(): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'getAllSupertypes' @ [153:53] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverType' @ [153:70] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'all' @ [153:84] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.all(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'!' @ [153:90] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [153:91] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [153:94] ==> public fun KotlinType.isAbstract(): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'mainCallable' @ [155:16] ==> value-parameter mainCallable: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[ValueParameterDescriptorImpl]

'copy' @ [155:29] ==> public abstract fun copy(receiverTypeInfo: TypeInfo = ..., possibleContainers: List<KtElement> = ..., isAbstract: Boolean = ...): CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[SimpleFunctionDescriptorImpl]

'receiverTypeInfo' @ [155:53] ==> val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'listOf' @ [155:92] ==> public fun <T> listOf(element: KtClass): List<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'containingClass' @ [155:99] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getAbstractCallableInfo[LocalVariableDescriptor]

'receiverType' @ [164:13] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[ValueParameterDescriptorImpl]

'Empty' @ [164:38] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'?:' @ [165:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtCallableDeclaration?, right: KtCallableDeclaration): KtCallableDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtCallableDeclaration

'originalExpression' @ [165:25] ==> value-parameter originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [165:44] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtFunction.() -> PsiElement?): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'bodyExpression' @ [165:83] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'originalExpression' @ [166:28] ==> value-parameter originalExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranches' @ [166:47] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranches(strict: Boolean = ..., noinline branches: KtProperty.() -> Iterable<PsiElement?>): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'listOf' @ [166:88] ==> public fun <T> listOf(vararg elements: KtPropertyAccessor?): List<KtPropertyAccessor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPropertyAccessor?

'getter' @ [166:95] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'setter' @ [166:103] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'callable' @ [168:13] ==> val callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'callable' @ [168:47] ==> val callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'receiverTypeReference' @ [168:56] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'context' @ [169:34] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [169:57] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callable' @ [169:84] ==> val callable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'callableDescriptor' @ [170:37] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'extensionReceiverParameter' @ [170:56] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [170:84] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'TypeInfo' @ [171:35] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'extensionReceiverType' @ [171:44] ==> val extensionReceiverType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'IN_VARIANCE' @ [171:76] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'mainCallable' @ [172:16] ==> value-parameter mainCallable: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[ValueParameterDescriptorImpl]

'copy' @ [172:29] ==> public abstract fun copy(receiverTypeInfo: TypeInfo = ..., possibleContainers: List<KtElement> = ..., isAbstract: Boolean = ...): CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableInfo[SimpleFunctionDescriptorImpl]

'newReceiverTypeInfo' @ [172:53] ==> val newReceiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.getCallableWithReceiverInsideExtension[LocalVariableDescriptor]

'emptyList' @ [172:95] ==> public fun <T> emptyList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'CreateCallableFromCallActionFactory<KtSimpleNameExpression>' @ [175:28] ==> private constructor CreateCallableFromCallActionFactory<E : KtExpression>(extensionsEnabled: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtExpression> -> KtSimpleNameExpression

'getExpressionOfInterest' @ [177:27] ==> protected final fun getExpressionOfInterest(diagnostic: Diagnostic): KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[SimpleFunctionDescriptorImpl]

'diagnostic' @ [177:51] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.getElementOfInterest[ValueParameterDescriptorImpl]

'refExpr' @ [178:17] ==> val refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.getElementOfInterest[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [178:25] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [178:83] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'refExpr' @ [179:20] ==> val refExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.getElementOfInterest[LocalVariableDescriptor]

'expression' @ [189:32] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [189:43] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'fullCallExpr' @ [190:31] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'getAssignmentByLHS' @ [190:44] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'fullCallExpr' @ [191:42] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'getExpressionForTypeGuess' @ [191:55] ==> public fun KtExpression.getExpressionForTypeGuess(): KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'expressionForTypeGuess' @ [192:31] ==> val expressionForTypeGuess: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'guessTypes' @ [192:54] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'analysisResult' @ [192:65] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [192:80] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [192:96] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [192:111] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'TypeInfo' @ [193:34] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'expressionForTypeGuess' @ [193:43] ==> val expressionForTypeGuess: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'if (varExpected) Variance.INVARIANT else Variance.OUT_VARIANCE' @ [193:67] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'varExpected' @ [193:71] ==> val varExpected: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'INVARIANT' @ [193:93] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [193:117] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'varExpected' @ [195:21] ==> val varExpected: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'returnTypes' @ [196:24] ==> val returnTypes: Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'any' @ [196:36] ==> public inline fun <T> Array<out KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'!' @ [196:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [196:43] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [196:46] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [196:66] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPrimitiveType' @ [196:82] ==> public open fun isPrimitiveType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [196:98] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'fullCallExpr' @ [197:24] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'parents' @ [197:37] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [197:45] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [197:59] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [197:90] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'PropertyInfo' @ [198:20] ==> public constructor PropertyInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, writable: Boolean, possibleContainers: List<KtElement> = ..., typeParameterInfos: List<TypeInfo> = ..., isAbstract: Boolean = ..., isLateinitPreferred: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[ClassConstructorDescriptorImpl]

'name' @ [198:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [198:39] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [198:53] ==> val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'varExpected' @ [198:69] ==> val varExpected: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'possibleContainers' @ [198:82] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[ValueParameterDescriptorImpl]

'canBeLateinit' @ [198:124] ==> val canBeLateinit: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.doCreateCallableInfo[LocalVariableDescriptor]

'Property' @ [201:26] ==> private constructor Property() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[ClassConstructorDescriptorImpl]

'super' @ [209:24] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default[LazyClassReceiverParameterDescriptor]

'doCreateCallableInfo' @ [209:30] ==> protected open fun doCreateCallableInfo(expression: KtSimpleNameExpression, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[SimpleFunctionDescriptorImpl]

'expression' @ [210:25] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [211:25] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo[ValueParameterDescriptorImpl]

'name' @ [212:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [213:25] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo[ValueParameterDescriptorImpl]

'possibleContainers' @ [214:25] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo[ValueParameterDescriptorImpl]

'filterNot' @ [214:44] ==> public inline fun <T> Iterable<KtElement>.filterNot(predicate: (KtElement) -> Boolean): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [214:56] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [214:78] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Default.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [214:81] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isInterfaceClass' @ [214:108] ==> public fun PsiNamedElement.isInterfaceClass(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'Property' @ [219:27] ==> private constructor Property() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[ClassConstructorDescriptorImpl]

'super' @ [226:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract[LazyClassReceiverParameterDescriptor]

'doCreateCallableInfo' @ [226:23] ==> protected open fun doCreateCallableInfo(expression: KtSimpleNameExpression, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[SimpleFunctionDescriptorImpl]

'expression' @ [226:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [226:56] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'name' @ [226:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [226:78] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'possibleContainers' @ [226:92] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'let' @ [226:113] ==> @InlineOnly public inline fun <T, R> CallableInfo.let(block: (CallableInfo) -> CallableInfo?): CallableInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> CallableInfo?

'getAbstractCallableInfo' @ [227:17] ==> protected final fun getAbstractCallableInfo(mainCallable: CallableInfo, originalExpression: KtExpression): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract[SimpleFunctionDescriptorImpl]

'it' @ [227:41] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [227:45] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'Property' @ [231:46] ==> private constructor Property() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[ClassConstructorDescriptorImpl]

'super' @ [238:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver[LazyClassReceiverParameterDescriptor]

'doCreateCallableInfo' @ [238:23] ==> protected open fun doCreateCallableInfo(expression: KtSimpleNameExpression, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[SimpleFunctionDescriptorImpl]

'expression' @ [238:44] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [238:56] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'name' @ [238:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [238:78] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'possibleContainers' @ [238:92] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'let' @ [238:113] ==> @InlineOnly public inline fun <T, R> CallableInfo.let(block: (CallableInfo) -> CallableInfo?): CallableInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> CallableInfo?

'ByImplicitExtensionReceiver' @ [239:17] ==> public object ByImplicitExtensionReceiver : CreateCallableFromCallActionFactory.Property defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[FakeCallableDescriptorForObject]

'getCallableWithReceiverInsideExtension' @ [239:45] ==> protected final fun getCallableWithReceiverInsideExtension(mainCallable: CallableInfo, originalExpression: KtExpression, context: BindingContext, receiverType: TypeInfo): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver[SimpleFunctionDescriptorImpl]

'it' @ [239:84] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [239:88] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [239:100] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [239:115] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'receiverType' @ [239:131] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'CreateCallableFromCallActionFactory<KtCallExpression>' @ [244:28] ==> private constructor CreateCallableFromCallActionFactory<E : KtExpression>(extensionsEnabled: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtExpression> -> KtCallExpression

'getExpressionOfInterest' @ [246:20] ==> protected final fun getExpressionOfInterest(diagnostic: Diagnostic): KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[SimpleFunctionDescriptorImpl]

'diagnostic' @ [246:44] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.getElementOfInterest[ValueParameterDescriptorImpl]

'expression' @ [256:30] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getParameterInfos' @ [256:41] ==> public fun KtCallExpression.getParameterInfos(): List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [257:34] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getTypeInfoForTypeArguments' @ [257:45] ==> public fun KtCallElement.getTypeInfoForTypeArguments(): List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [258:38] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [258:49] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'fullCallExpression' @ [259:32] ==> val fullCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'guessTypes' @ [259:51] ==> public fun KtExpression.guessTypes(context: BindingContext, module: ModuleDescriptor, pseudocode: Pseudocode? = ..., coerceUnusedToUnit: Boolean = ..., allowErrorTypes: Boolean = ...): Array<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'analysisResult' @ [259:62] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [259:77] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [259:93] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [259:108] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'singleOrNull' @ [259:126] ==> public fun <T> Array<out KotlinType>.singleOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'if (expectedType != null) {
                TypeInfo(expectedType, Variance.OUT_VARIANCE)
            } else {
                TypeInfo(fullCallExpression, Variance.OUT_VARIANCE)
            }' @ [260:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeInfo, elseBranch: TypeInfo): TypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeInfo

'expectedType' @ [260:34] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'TypeInfo' @ [261:17] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [261:26] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'OUT_VARIANCE' @ [261:49] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [263:17] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'fullCallExpression' @ [263:26] ==> val fullCallExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'OUT_VARIANCE' @ [263:55] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'FunctionInfo' @ [265:20] ==> public constructor FunctionInfo(name: String, receiverTypeInfo: TypeInfo, returnTypeInfo: TypeInfo, possibleContainers: List<KtElement> = ..., parameterInfos: List<ParameterInfo> = ..., typeParameterInfos: List<TypeInfo> = ..., isOperator: Boolean = ..., isInfix: Boolean = ..., isAbstract: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.FunctionInfo[ClassConstructorDescriptorImpl]

'name' @ [265:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [265:39] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'returnType' @ [265:53] ==> val returnType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'possibleContainers' @ [265:65] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[ValueParameterDescriptorImpl]

'parameters' @ [265:85] ==> val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'typeParameters' @ [265:97] ==> val typeParameters: List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.doCreateCallableInfo[LocalVariableDescriptor]

'Function' @ [268:26] ==> private constructor Function() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[ClassConstructorDescriptorImpl]

'Function' @ [270:27] ==> private constructor Function() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[ClassConstructorDescriptorImpl]

'super' @ [277:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract[LazyClassReceiverParameterDescriptor]

'doCreateCallableInfo' @ [277:23] ==> protected open fun doCreateCallableInfo(expression: KtCallExpression, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[SimpleFunctionDescriptorImpl]

'expression' @ [277:44] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [277:56] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'name' @ [277:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [277:78] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'possibleContainers' @ [277:92] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'let' @ [277:113] ==> @InlineOnly public inline fun <T, R> CallableInfo.let(block: (CallableInfo) -> CallableInfo?): CallableInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> CallableInfo?

'getAbstractCallableInfo' @ [278:17] ==> protected final fun getAbstractCallableInfo(mainCallable: CallableInfo, originalExpression: KtExpression): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract[SimpleFunctionDescriptorImpl]

'it' @ [278:41] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [278:45] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.Abstract.doCreateCallableInfo[ValueParameterDescriptorImpl]

'Function' @ [282:46] ==> private constructor Function() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[ClassConstructorDescriptorImpl]

'super' @ [289:17] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver[LazyClassReceiverParameterDescriptor]

'doCreateCallableInfo' @ [289:23] ==> protected open fun doCreateCallableInfo(expression: KtCallExpression, analysisResult: AnalysisResult, name: String, receiverType: TypeInfo, possibleContainers: List<KtElement>): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[SimpleFunctionDescriptorImpl]

'expression' @ [289:44] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [289:56] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'name' @ [289:72] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'receiverType' @ [289:78] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'possibleContainers' @ [289:92] ==> value-parameter possibleContainers: List<KtElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'let' @ [289:113] ==> @InlineOnly public inline fun <T, R> CallableInfo.let(block: (CallableInfo) -> CallableInfo?): CallableInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableInfo
    <R> -> CallableInfo?

'getCallableWithReceiverInsideExtension' @ [290:17] ==> protected final fun getCallableWithReceiverInsideExtension(mainCallable: CallableInfo, originalExpression: KtExpression, context: BindingContext, receiverType: TypeInfo): CallableInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver[SimpleFunctionDescriptorImpl]

'it' @ [290:56] ==> value-parameter it: CallableInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [290:60] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'analysisResult' @ [290:72] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [290:87] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'receiverType' @ [290:103] ==> value-parameter receiverType: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function.ByImplicitExtensionReceiver.doCreateCallableInfo[ValueParameterDescriptorImpl]

'CreateCallableFromCallActionFactory<KtCallExpression>' @ [295:25] ==> private constructor CreateCallableFromCallActionFactory<E : KtExpression>(extensionsEnabled: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtExpression> -> KtCallExpression

'getExpressionOfInterest' @ [297:20] ==> protected final fun getExpressionOfInterest(diagnostic: Diagnostic): KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor[SimpleFunctionDescriptorImpl]

'diagnostic' @ [297:44] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.getElementOfInterest[ValueParameterDescriptorImpl]

'expression' @ [307:17] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'typeArguments' @ [307:28] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [307:42] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'expression' @ [309:35] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'calleeExpression' @ [310:22] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getReferenceTargets' @ [311:23] ==> public fun KtExpression.getReferenceTargets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [311:43] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [311:58] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'mapNotNull' @ [312:23] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> ClassifierDescriptorWithTypeParameters?): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> ClassifierDescriptorWithTypeParameters

'it' @ [312:37] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [312:68] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'distinct' @ [313:23] ==> public fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.distinct(): List<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'singleOrNull' @ [314:23] ==> public fun <T> List<ClassifierDescriptorWithTypeParameters>.singleOrNull(): ClassifierDescriptorWithTypeParameters? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'classDescriptor' @ [315:25] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'source' @ [315:42] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [315:50] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'klass' @ [316:18] ==> val klass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'klass' @ [316:39] ==> val klass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'!' @ [316:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [316:63] ==> val klass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'canRefactor' @ [316:69] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'analysisResult' @ [318:32] ==> value-parameter analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [318:47] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'EXPECTED_EXPRESSION_TYPE' @ [318:77] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [318:103] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [318:114] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [319:35] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'builtIns' @ [319:51] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'nullableAnyType' @ [319:60] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'!' @ [320:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [320:18] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'defaultType' @ [320:34] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'isSubtypeOf' @ [320:46] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [320:58] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'expression' @ [322:30] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[ValueParameterDescriptorImpl]

'getParameterInfos' @ [322:41] ==> public fun KtCallExpression.getParameterInfos(): List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file typeUtils.kt[SimpleFunctionDescriptorImpl]

'SecondaryConstructorInfo' @ [324:20] ==> public constructor SecondaryConstructorInfo(parameterInfos: List<ParameterInfo>, targetClass: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.SecondaryConstructorInfo[ClassConstructorDescriptorImpl]

'parameters' @ [324:45] ==> val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'klass' @ [324:57] ==> val klass: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Constructor.doCreateCallableInfo[LocalVariableDescriptor]

'arrayOf' @ [329:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: CreateCallableFromCallActionFactory<KtCallExpression>): Array<CreateCallableFromCallActionFactory<KtCallExpression>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> CreateCallableFromCallActionFactory<KtCallExpression>

'Default' @ [329:42] ==> public object Default : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'Abstract' @ [330:42] ==> public object Abstract : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'ByImplicitExtensionReceiver' @ [331:42] ==> public object ByImplicitExtensionReceiver : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'Constructor' @ [332:33] ==> public object Constructor : CreateCallableFromCallActionFactory<KtCallExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[FakeCallableDescriptorForObject]

'arrayOf' @ [333:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: CreateCallableFromCallActionFactory<out KtReferenceExpression>): Array<CreateCallableFromCallActionFactory<out KtReferenceExpression>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> CreateCallableFromCallActionFactory<out KtReferenceExpression>

'Default' @ [333:42] ==> public object Default : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'Abstract' @ [334:42] ==> public object Abstract : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'ByImplicitExtensionReceiver' @ [335:42] ==> public object ByImplicitExtensionReceiver : CreateCallableFromCallActionFactory.Function defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Function[FakeCallableDescriptorForObject]

'Constructor' @ [336:33] ==> public object Constructor : CreateCallableFromCallActionFactory<KtCallExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory[FakeCallableDescriptorForObject]

'Default' @ [337:42] ==> public object Default : CreateCallableFromCallActionFactory.Property defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[FakeCallableDescriptorForObject]

'Abstract' @ [338:42] ==> public object Abstract : CreateCallableFromCallActionFactory.Property defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[FakeCallableDescriptorForObject]

'ByImplicitExtensionReceiver' @ [339:42] ==> public object ByImplicitExtensionReceiver : CreateCallableFromCallActionFactory.Property defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createCallable.CreateCallableFromCallActionFactory.Property[FakeCallableDescriptorForObject]

