'CreateClassFromUsageFactory<KtSimpleNameExpression>' @ [32:58] ==> public constructor CreateClassFromUsageFactory<E : KtElement>() defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromUsageFactory[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtSimpleNameExpression

'diagnostic' @ [34:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getElementOfInterest[ValueParameterDescriptorImpl]

'psiElement' @ [34:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'refExpr' @ [35:13] ==> val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [35:21] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'refExpr' @ [36:16] ==> val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getElementOfInterest[LocalVariableDescriptor]

'element' @ [40:16] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression[ValueParameterDescriptorImpl]

'parent' @ [40:24] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [40:31] ==> @InlineOnly public inline fun <T, R> (PsiElement..PsiElement?).let(block: ((PsiElement..PsiElement?)) -> KtExpression?): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> KtExpression?

'when {
                it is KtCallExpression && it.calleeExpression == element -> return null
                it is KtQualifiedExpression && it.selectorExpression == element -> it
                else -> element
            }' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'it' @ [42:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [42:43] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [42:46] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [42:66] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression[ValueParameterDescriptorImpl]

'it' @ [43:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:48] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'selectorExpression' @ [43:51] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [43:73] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression[ValueParameterDescriptorImpl]

'it' @ [43:84] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [44:25] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getFullCallExpression[ValueParameterDescriptorImpl]

'element' @ [49:72] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.isQualifierExpected[ValueParameterDescriptorImpl]

'isDotReceiver' @ [49:80] ==> public fun KtExpression.isDotReceiver(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'?:' @ [49:100] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'element' @ [49:101] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.isQualifierExpected[ValueParameterDescriptorImpl]

'parent' @ [49:109] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isDotReceiver' @ [49:147] ==> public fun KtExpression.isDotReceiver(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'when (element) {
                is KtClass -> element.isEnum()
                is PsiClass -> element.isEnum
                else -> false
            }' @ [53:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [53:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.isEnum[ValueParameterDescriptorImpl]

'element' @ [54:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.isEnum[ValueParameterDescriptorImpl]

'isEnum' @ [54:39] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'element' @ [55:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.isEnum[ValueParameterDescriptorImpl]

'isEnum' @ [55:40] ==> public final val PsiClass.isEnum: Boolean[MyPropertyDescriptor]

'element' @ [60:20] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getReferencedName' @ [60:28] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'component1' @ [62:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [62:23] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'element' @ [62:43] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'analyzeFullyAndGetResult' @ [62:51] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getFullCallExpression' @ [64:28] ==> private final fun getFullCallExpression(element: KtSimpleNameExpression): KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [64:50] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'emptyList' @ [64:81] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'element' @ [66:24] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [66:32] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'inImport' @ [67:13] ==> val inImport: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'isQualifierExpected' @ [67:25] ==> private final fun isQualifierExpected(element: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [67:45] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'fullCallExpr' @ [68:37] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'receiverExpression' @ [68:78] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'getQualifiedElementSelector' @ [68:98] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'receiverSelector' @ [69:39] ==> val receiverSelector: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'let' @ [69:57] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> DeclarationDescriptor?

'context' @ [69:63] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [69:86] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [69:104] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'getTargetParentsByQualifier' @ [71:33] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [71:61] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'receiverSelector' @ [71:70] ==> val receiverSelector: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'qualifierDescriptor' @ [71:96] ==> val qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ifEmpty' @ [72:22] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'emptyList' @ [72:39] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'targetParents' @ [74:13] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'forEach' @ [74:27] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [75:21] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getCreatePackageFixIfApplicable' @ [75:29] ==> internal fun KtSimpleNameExpression.getCreatePackageFixIfApplicable(targetParent: PsiElement): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [75:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [75:81] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [78:18] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'checkClassName' @ [78:23] ==> internal fun String.checkClassName(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [78:48] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'values' @ [81:22] ==> public final fun values(): Array<ClassKind> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[SimpleFunctionDescriptorImpl]

'filter' @ [82:22] ==> public inline fun <T> Array<out ClassKind>.filter(predicate: (ClassKind) -> Boolean): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'when (it) {
                            ClassKind.ANNOTATION_CLASS -> inImport
                            ClassKind.ENUM_ENTRY -> inImport && targetParents.any { isEnum(it) }
                            else -> true
                        }' @ [83:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [83:31] ==> value-parameter it: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'ANNOTATION_CLASS' @ [84:39] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'inImport' @ [84:59] ==> val inImport: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ENUM_ENTRY' @ [85:39] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'inImport' @ [85:53] ==> val inImport: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'targetParents' @ [85:65] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'any' @ [85:79] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'isEnum' @ [85:85] ==> local final fun isEnum(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[SimpleFunctionDescriptorImpl]

'it' @ [85:92] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [90:22] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'parent' @ [90:30] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [91:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'parent' @ [91:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'receiverExpression' @ [91:58] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtClassLiteralExpression[DeserializedPropertyDescriptor]

'element' @ [91:80] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'listOf' @ [92:20] ==> public fun <T> listOf(vararg elements: ClassKind): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'PLAIN_CLASS' @ [92:37] ==> enum entry PLAIN_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [92:60] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'INTERFACE' @ [92:82] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ANNOTATION_CLASS' @ [92:103] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'OBJECT' @ [92:131] ==> enum entry OBJECT defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'fullCallExpr' @ [95:13] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'getAssignmentByLHS' @ [95:26] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [95:75] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'element' @ [97:20] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[ValueParameterDescriptorImpl]

'getCall' @ [97:28] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [97:36] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'emptyList' @ [97:67] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'getTargetParentsByCall' @ [98:29] ==> internal fun getTargetParentsByCall(call: Call, context: BindingContext): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [98:52] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'context' @ [98:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'ifEmpty' @ [98:67] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'emptyList' @ [98:84] ==> public fun <T> emptyList(): List<ClassKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassKind

'isInnerClassExpected' @ [99:13] ==> internal fun isInnerClassExpected(call: Call): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [99:34] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'emptyList' @ [99:60] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'asList' @ [101:31] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (ClassKind..ClassKind?)): (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'OBJECT' @ [101:48] ==> enum entry OBJECT defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [101:66] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'fullCallExpr' @ [103:28] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'guessTypeForClass' @ [103:41] ==> internal fun KtExpression.guessTypeForClass(context: BindingContext, moduleDescriptor: ModuleDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [103:59] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'moduleDescriptor' @ [103:68] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'allKinds' @ [105:16] ==> val allKinds: (MutableList<(ClassKind..ClassKind?)>..List<(ClassKind..ClassKind?)>?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'filter' @ [105:25] ==> public inline fun <T> Iterable<(ClassKind..ClassKind?)>.filter(predicate: ((ClassKind..ClassKind?)) -> Boolean): List<(ClassKind..ClassKind?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind..org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind?)

'targetParents' @ [106:13] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'any' @ [106:27] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'expectedType' @ [107:18] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'getClassKindFilter' @ [107:42] ==> internal fun getClassKindFilter(expectedType: KotlinType, containingDeclaration: PsiElement): (ClassKind) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [107:61] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[LocalVariableDescriptor]

'targetParent' @ [107:75] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classKind' @ [107:89] ==> value-parameter classKind: (ClassKind..ClassKind?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'when (classKind) {
                    ClassKind.OBJECT -> true
                    ClassKind.ENUM_ENTRY -> isEnum(targetParent)
                    else -> false
                }' @ [107:104] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'classKind' @ [107:110] ==> value-parameter classKind: (ClassKind..ClassKind?) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT' @ [108:31] ==> enum entry OBJECT defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'ENUM_ENTRY' @ [109:31] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassKind[FakeCallableDescriptorForObject]

'isEnum' @ [109:45] ==> local final fun isEnum(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds[SimpleFunctionDescriptorImpl]

'targetParent' @ [109:52] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.getPossibleClassKinds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [117:20] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getReferencedName' @ [117:28] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'component1' @ [119:14] ==> public final operator fun component1(): BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'component2' @ [119:23] ==> public final operator fun component2(): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'element' @ [119:43] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'analyzeFullyAndGetResult' @ [119:51] ==> public fun KtElement.analyzeFullyAndGetResult(vararg extraFiles: KtFile): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getFullCallExpression' @ [121:28] ==> private final fun getFullCallExpression(element: KtSimpleNameExpression): KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [121:50] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'element' @ [123:13] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'isInImportDirective' @ [123:21] ==> public fun KtExpression.isInImportDirective(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isQualifierExpected' @ [123:46] ==> private final fun isQualifierExpected(element: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [123:66] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'fullCallExpr' @ [124:37] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'receiverExpression' @ [124:78] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'getQualifiedElementSelector' @ [124:98] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'receiverSelector' @ [125:39] ==> val receiverSelector: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'let' @ [125:57] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> DeclarationDescriptor?

'context' @ [125:63] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [125:86] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [125:104] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData.<anonymous>[ValueParameterDescriptorImpl]

'getTargetParentsByQualifier' @ [127:33] ==> internal fun getTargetParentsByQualifier(element: KtElement, isQualified: Boolean, qualifierDescriptor: DeclarationDescriptor?): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [127:61] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'receiverSelector' @ [127:70] ==> val receiverSelector: KtReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'qualifierDescriptor' @ [127:96] ==> val qualifierDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'ifEmpty' @ [128:22] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'ClassInfo' @ [130:20] ==> public constructor ClassInfo(kind: ClassKind = ..., name: String, targetParents: List<PsiElement>, expectedTypeInfo: TypeInfo, inner: Boolean = ..., open: Boolean = ..., typeArguments: List<TypeInfo> = ..., parameterInfos: List<ParameterInfo> = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[ClassConstructorDescriptorImpl]

'name' @ [131:28] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'targetParents' @ [132:37] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'Empty' @ [133:49] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'element' @ [137:20] ==> value-parameter element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[ValueParameterDescriptorImpl]

'getCall' @ [137:28] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [137:36] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'getTargetParentsByCall' @ [138:29] ==> internal fun getTargetParentsByCall(call: Call, context: BindingContext): List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [138:52] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'context' @ [138:58] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'ifEmpty' @ [138:67] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'fullCallExpr' @ [140:32] ==> val fullCallExpr: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'guessTypeForClass' @ [140:45] ==> internal fun KtExpression.guessTypeForClass(context: BindingContext, moduleDescriptor: ModuleDescriptor): KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [140:63] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'moduleDescriptor' @ [140:72] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'toClassTypeInfo' @ [140:91] ==> internal fun KotlinType.toClassTypeInfo(): TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass in file createClassUtils.kt[SimpleFunctionDescriptorImpl]

'Empty' @ [140:121] ==> public object Empty : TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[FakeCallableDescriptorForObject]

'ClassInfo' @ [142:16] ==> public constructor ClassInfo(kind: ClassKind = ..., name: String, targetParents: List<PsiElement>, expectedTypeInfo: TypeInfo, inner: Boolean = ..., open: Boolean = ..., typeArguments: List<TypeInfo> = ..., parameterInfos: List<ParameterInfo> = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.ClassInfo[ClassConstructorDescriptorImpl]

'name' @ [143:24] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'targetParents' @ [144:33] ==> val targetParents: List<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

'expectedTypeInfo' @ [145:36] ==> val expectedTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createClass.CreateClassFromReferenceExpressionActionFactory.extractFixData[LocalVariableDescriptor]

