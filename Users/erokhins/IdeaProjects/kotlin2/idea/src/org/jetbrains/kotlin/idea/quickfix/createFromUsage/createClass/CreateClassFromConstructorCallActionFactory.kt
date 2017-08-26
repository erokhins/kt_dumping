'CreateClassFromUsageFactory<KtCallExpression>' @ [32:53] ==> public constructor CreateClassFromUsageFactory<E : KtElement>() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtCallExpression

'diagnostic' @ [34:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [34:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagElement' @ [35:13] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [35:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'diagElement' @ [37:24] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[LocalVariableDescriptor]

'parent' @ [37:36] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (callExpr.calleeExpression == diagElement) callExpr else null' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtCallExpression?, elseBranch: KtCallExpression?): KtCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtCallExpression?

'callExpr' @ [38:20] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[LocalVariableDescriptor]

'calleeExpression' @ [38:29] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'diagElement' @ [38:49] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[LocalVariableDescriptor]

'callExpr' @ [38:62] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getElementOfInterest[LocalVariableDescriptor]

'diagnostic' @ [42:33] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'psiElement' @ [42:44] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [42:55] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'component1' @ [44:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [44:23] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'element' @ [44:43] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'analyzeFullyAndGetResult' @ [44:51] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [45:20] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getCall' @ [45:28] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [45:36] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'emptyList' @ [45:55] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'getTargetParentsByCall' @ [46:29] ==> internal fun getTargetParentsByCall(call: Call, context: BindingContext): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'call' @ [46:52] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'context' @ [46:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ifEmpty' @ [46:67] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'emptyList' @ [46:84] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'if (inAnnotationEntry) ClassKind.ANNOTATION_CLASS else ClassKind.PLAIN_CLASS' @ [48:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassKind, elseBranch: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassKind

'inAnnotationEntry' @ [48:29] ==> val inAnnotationEntry: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [48:58] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'PLAIN_CLASS' @ [48:90] ==> enum entry PLAIN_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'element' @ [49:28] ==> value-parameter element: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [49:36] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'fullCallExpr' @ [50:28] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'guessTypeForClass' @ [50:41] ==> internal fun KtExpression.guessTypeForClass(context: BindingContext, moduleDescriptor: ModuleDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'context' @ [50:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'moduleDescriptor' @ [50:68] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'expectedType' @ [51:13] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'!' @ [51:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetParents' @ [51:38] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'any' @ [51:52] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getClassKindFilter' @ [51:58] ==> internal fun getClassKindFilter(expectedType: KotlinType, containingDeclaration: PsiElement): (ClassKind) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'expectedType' @ [51:77] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'it' @ [51:91] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'classKind' @ [51:95] ==> val classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'emptyList' @ [51:116] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'listOf' @ [53:16] ==> public fun <T> listOf(element: ClassKind): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'classKind' @ [53:23] ==> val classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'diagnostic' @ [57:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[ValueParameterDescriptorImpl]

'psiElement' @ [57:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagElement' @ [58:13] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [58:25] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'diagElement' @ [60:33] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [60:45] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'diagElement' @ [62:24] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'parent' @ [62:36] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpr' @ [63:13] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'calleeExpression' @ [63:22] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'diagElement' @ [63:42] ==> val diagElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'callExpr' @ [65:26] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'calleeExpression' @ [65:35] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'calleeExpr' @ [67:20] ==> val calleeExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getReferencedName' @ [67:31] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inAnnotationEntry' @ [68:14] ==> val inAnnotationEntry: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'!' @ [68:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [68:36] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'checkClassName' @ [68:41] ==> internal fun String.checkClassName(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'callExpr' @ [70:26] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'parent' @ [70:35] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (callParent is KtQualifiedExpression && callParent.selectorExpression == callExpr) callParent else callExpr' @ [72:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'callParent' @ [72:21] ==> val callParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'callParent' @ [72:60] ==> val callParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'selectorExpression' @ [72:71] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'callExpr' @ [72:93] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'callParent' @ [72:103] ==> val callParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'callExpr' @ [72:119] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'component1' @ [74:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [74:23] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'callExpr' @ [74:43] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'analyzeFullyAndGetResult' @ [74:52] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'callExpr' @ [76:20] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getCall' @ [76:29] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [76:37] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getTargetParentsByCall' @ [77:29] ==> internal fun getTargetParentsByCall(call: Call, context: BindingContext): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'call' @ [77:52] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'context' @ [77:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'ifEmpty' @ [77:67] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'isInnerClassExpected' @ [78:21] ==> internal fun isInnerClassExpected(call: Call): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'call' @ [78:42] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'callExpr' @ [80:30] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'valueArguments' @ [80:39] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'if (inAnnotationEntry && valueArguments.size == 1) "value" else null' @ [81:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'inAnnotationEntry' @ [81:36] ==> val inAnnotationEntry: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'valueArguments' @ [81:57] ==> val valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'size' @ [81:72] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [82:23] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'builtIns' @ [82:40] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'nullableAnyType' @ [82:49] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'valueArguments' @ [83:30] ==> val valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'map' @ [83:45] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> ParameterInfo): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> ParameterInfo

'ParameterInfo' @ [84:13] ==> public constructor ParameterInfo(typeInfo: TypeInfo, preferredName: String? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.ParameterInfo[ClassConstructorDescriptorImpl]

'it' @ [85:21] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [85:24] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'let' @ [85:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> TypeInfo): TypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> TypeInfo

'TypeInfo' @ [85:55] ==> public fun TypeInfo(expressionOfType: KtExpression, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'it' @ [85:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [85:77] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeInfo' @ [85:95] ==> public fun TypeInfo(theType: KotlinType, variance: Variance): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableInfo.kt[SimpleFunctionDescriptorImpl]

'anyType' @ [85:104] ==> val anyType: SimpleType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'IN_VARIANCE' @ [85:122] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'it' @ [86:21] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [86:24] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'referenceExpression' @ [86:43] ==> public open val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'getReferencedName' @ [86:64] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'defaultParamName' @ [86:87] ==> val defaultParamName: String? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'if (inAnnotationEntry) ClassKind.ANNOTATION_CLASS else ClassKind.PLAIN_CLASS' @ [90:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassKind, elseBranch: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassKind

'inAnnotationEntry' @ [90:29] ==> val inAnnotationEntry: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'ANNOTATION_CLASS' @ [90:58] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'PLAIN_CLASS' @ [90:90] ==> enum entry PLAIN_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'fullCallExpr' @ [92:28] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'guessTypeForClass' @ [92:41] ==> internal fun KtExpression.guessTypeForClass(context: BindingContext, moduleDescriptor: ModuleDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'context' @ [92:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'moduleDescriptor' @ [92:68] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'expectedType' @ [93:32] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'toClassTypeInfo' @ [93:46] ==> internal fun KotlinType.toClassTypeInfo(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'Empty' @ [93:76] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'if (expectedType != null) {
            targetParents.filter { getClassKindFilter(expectedType, it)(classKind) }.ifEmpty { return null }
        } else targetParents' @ [94:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiElement>, elseBranch: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiElement>

'expectedType' @ [94:35] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'targetParents' @ [95:13] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'filter' @ [95:27] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getClassKindFilter' @ [95:36] ==> internal fun getClassKindFilter(expectedType: KotlinType, containingDeclaration: PsiElement): (ClassKind) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass[SimpleFunctionDescriptorImpl]

'expectedType' @ [95:55] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'it' @ [95:69] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'classKind' @ [95:73] ==> val classKind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'ifEmpty' @ [95:86] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'targetParents' @ [96:16] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'if (inAnnotationEntry) Collections.emptyList() else callExpr.getTypeInfoForTypeArguments()' @ [98:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<TypeInfo>..List<TypeInfo>?), elseBranch: (List<TypeInfo>..List<TypeInfo>?)): (List<TypeInfo>..List<TypeInfo>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo>..kotlin.collections.List<org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo>?)

'inAnnotationEntry' @ [98:37] ==> val inAnnotationEntry: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'emptyList' @ [98:68] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(TypeInfo..TypeInfo?)>..List<(TypeInfo..TypeInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeInfo

'callExpr' @ [98:85] ==> val callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'getTypeInfoForTypeArguments' @ [98:94] ==> public fun KtCallElement.getTypeInfoForTypeArguments(): List<TypeInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder[SimpleFunctionDescriptorImpl]

'ClassInfo' @ [100:16] ==> public constructor ClassInfo(kind: ClassKind = ..., name: String, targetParents: List<PsiElement>, expectedTypeInfo: TypeInfo, inner: Boolean = ..., open: Boolean = ..., typeArguments: List<TypeInfo> = ..., parameterInfos: List<ParameterInfo> = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[ClassConstructorDescriptorImpl]

'name' @ [101:24] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'filteredParents' @ [102:33] ==> val filteredParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'expectedTypeInfo' @ [103:36] ==> val expectedTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'inner' @ [104:25] ==> val inner: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'typeArgumentInfos' @ [105:33] ==> val typeArgumentInfos: (List<TypeInfo>..List<TypeInfo>?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

'parameterInfos' @ [106:34] ==> val parameterInfos: List<ParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromConstructorCallActionFactory.extractFixData[LocalVariableDescriptor]

