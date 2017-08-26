'KotlinIntentionActionsFactory' @ [32:44] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'when (targetVisibility) {
            PROTECTED -> if (protectedAllowed) listOf(boundVisibility, PROTECTED) else listOf(boundVisibility)
            INTERNAL -> listOf(boundVisibility, INTERNAL)
            boundVisibility -> listOf(boundVisibility)
            else -> listOf()
        }' @ [42:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Visibility>, entry1: List<Visibility>, entry2: List<Visibility>, entry3: List<Visibility>): List<Visibility>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Visibility>

'targetVisibility' @ [42:42] ==> value-parameter targetVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'PROTECTED' @ [43:13] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'if (protectedAllowed) listOf(boundVisibility, PROTECTED) else listOf(boundVisibility)' @ [43:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Visibility>, elseBranch: List<Visibility>): List<Visibility>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Visibility>

'protectedAllowed' @ [43:30] ==> value-parameter protectedAllowed: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'listOf' @ [43:48] ==> public fun <T> listOf(vararg elements: Visibility): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'boundVisibility' @ [43:55] ==> value-parameter boundVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'PROTECTED' @ [43:72] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'listOf' @ [43:88] ==> public fun <T> listOf(element: Visibility): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'boundVisibility' @ [43:95] ==> value-parameter boundVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'INTERNAL' @ [44:13] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'listOf' @ [44:25] ==> public fun <T> listOf(vararg elements: Visibility): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'boundVisibility' @ [44:32] ==> value-parameter boundVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'INTERNAL' @ [44:49] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'boundVisibility' @ [45:13] ==> value-parameter boundVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'listOf' @ [45:32] ==> public fun <T> listOf(element: Visibility): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'boundVisibility' @ [45:39] ==> value-parameter boundVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'listOf' @ [46:21] ==> @InlineOnly public inline fun <T> listOf(): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'possibleVisibilities' @ [48:9] ==> val possibleVisibilities: List<Visibility> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[LocalVariableDescriptor]

'mapNotNullTo' @ [48:30] ==> public inline fun <T, R : Any, C : MutableCollection<in IntentionAction>> Iterable<Visibility>.mapNotNullTo(destination: MutableList<IntentionAction>, transform: (Visibility) -> IntentionAction?): MutableList<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility
    <R : Any> -> IntentionAction
    <C : MutableCollection<in R>> -> MutableList<IntentionAction>

'fixes' @ [48:43] ==> value-parameter fixes: MutableList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'ChangeVisibilityFix' @ [48:52] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityFix[FakeCallableDescriptorForObject]

'create' @ [48:72] ==> public final fun create(declaration: KtModifierListOwner, descriptor: DeclarationDescriptorWithVisibility, targetVisibility: Visibility): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityFix.Companion[SimpleFunctionDescriptorImpl]

'modifierListOwner' @ [48:79] ==> value-parameter modifierListOwner: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'descriptor' @ [48:98] ==> value-parameter descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility[ValueParameterDescriptorImpl]

'it' @ [48:110] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.addFixToTargetVisibility.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [52:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'diagnostic' @ [53:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[ValueParameterDescriptorImpl]

'factory' @ [53:34] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'factory' @ [55:33] ==> val factory: DiagnosticFactory3<*, EffectiveVisibility, DescriptorWithRelation, EffectiveVisibility> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'cast' @ [55:41] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'diagnostic' @ [55:46] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[ValueParameterDescriptorImpl]

'exposedDiagnostic' @ [56:33] ==> val exposedDiagnostic: DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'b' @ [56:51] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>.b: (DescriptorWithRelation..DescriptorWithRelation?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DescriptorWithRelation..org.jetbrains.kotlin.descriptors.DescriptorWithRelation?)
    <C : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)

'descriptor' @ [56:53] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[DeserializedPropertyDescriptor]

'emptyList' @ [56:114] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'DescriptorToSourceUtils' @ [58:17] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [58:41] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'exposedDescriptor' @ [58:65] ==> val exposedDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'emptyList' @ [58:118] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'exposedDiagnostic' @ [59:33] ==> val exposedDiagnostic: DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'c' @ [59:51] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>.c: (EffectiveVisibility..EffectiveVisibility?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DescriptorWithRelation..org.jetbrains.kotlin.descriptors.DescriptorWithRelation?)
    <C : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)

'exposedDiagnostic' @ [60:30] ==> val exposedDiagnostic: DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'a' @ [60:48] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), (EffectiveVisibility..EffectiveVisibility?), (DescriptorWithRelation..DescriptorWithRelation?), (EffectiveVisibility..EffectiveVisibility?)>.a: (EffectiveVisibility..EffectiveVisibility?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DescriptorWithRelation..org.jetbrains.kotlin.descriptors.DescriptorWithRelation?)
    <C : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.EffectiveVisibility..org.jetbrains.kotlin.descriptors.EffectiveVisibility?)

'component1' @ [61:14] ==> public final operator fun component1(): Visibility defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [61:36] ==> public final operator fun component2(): Visibility defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (exposedVisibility.relation(userVisibility)) {
            LESS -> Pair(exposedVisibility.toVisibility(), userVisibility.toVisibility())
            else -> Pair(PRIVATE, PUBLIC)
        }' @ [61:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<Visibility, Visibility>, entry1: Pair<Visibility, Visibility>): Pair<Visibility, Visibility>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<Visibility, Visibility>

'exposedVisibility' @ [61:69] ==> val exposedVisibility: (EffectiveVisibility..EffectiveVisibility?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'relation' @ [61:87] ==> public abstract fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedSimpleFunctionDescriptor]

'userVisibility' @ [61:96] ==> val userVisibility: (EffectiveVisibility..EffectiveVisibility?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'LESS' @ [62:13] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Pair' @ [62:21] ==> public constructor Pair<out A, out B>(first: Visibility, second: Visibility) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Visibility
    <out B> -> Visibility

'exposedVisibility' @ [62:26] ==> val exposedVisibility: (EffectiveVisibility..EffectiveVisibility?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'toVisibility' @ [62:44] ==> public abstract fun toVisibility(): Visibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedSimpleFunctionDescriptor]

'userVisibility' @ [62:60] ==> val userVisibility: (EffectiveVisibility..EffectiveVisibility?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'toVisibility' @ [62:75] ==> public abstract fun toVisibility(): Visibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[DeserializedSimpleFunctionDescriptor]

'Pair' @ [63:21] ==> public constructor Pair<out A, out B>(first: Visibility, second: Visibility) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Visibility
    <out B> -> Visibility

'PRIVATE' @ [63:26] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC' @ [63:35] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'ArrayList' @ [65:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IntentionAction

'diagnostic' @ [66:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [66:42] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getParentOfType' @ [66:53] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'exposedDeclaration' @ [67:32] ==> val exposedDeclaration: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'parent' @ [67:51] ==> public final val KtModifierListOwner.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'userDeclaration' @ [67:61] ==> val userDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'parent' @ [67:78] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'userDeclaration' @ [68:13] ==> val userDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'userDeclaration' @ [69:34] ==> val userDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'toDescriptor' @ [69:50] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'userDescriptor' @ [70:17] ==> val userDescriptor: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'isVisibleIgnoringReceiver' @ [70:56] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'exposedDescriptor' @ [70:82] ==> val exposedDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'userDescriptor' @ [70:101] ==> val userDescriptor: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'addFixToTargetVisibility' @ [71:17] ==> private final fun addFixToTargetVisibility(modifierListOwner: KtModifierListOwner, descriptor: DeclarationDescriptorWithVisibility, targetVisibility: Visibility, boundVisibility: Visibility, protectedAllowed: Boolean, fixes: MutableList<IntentionAction>): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory[SimpleFunctionDescriptorImpl]

'userDeclaration' @ [71:42] ==> val userDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'userDescriptor' @ [71:59] ==> val userDescriptor: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'targetUserVisibility' @ [72:42] ==> val targetUserVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'PRIVATE' @ [72:64] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'protectedAllowed' @ [73:42] ==> val protectedAllowed: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'result' @ [73:60] ==> val result: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'addFixToTargetVisibility' @ [76:9] ==> private final fun addFixToTargetVisibility(modifierListOwner: KtModifierListOwner, descriptor: DeclarationDescriptorWithVisibility, targetVisibility: Visibility, boundVisibility: Visibility, protectedAllowed: Boolean, fixes: MutableList<IntentionAction>): Unit defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory[SimpleFunctionDescriptorImpl]

'exposedDeclaration' @ [76:34] ==> val exposedDeclaration: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'exposedDescriptor' @ [76:54] ==> val exposedDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'targetExposedVisibility' @ [77:34] ==> val targetExposedVisibility: Visibility defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'PUBLIC' @ [77:59] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'protectedAllowed' @ [78:34] ==> val protectedAllowed: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'result' @ [78:52] ==> val result: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

'result' @ [79:16] ==> val result: ArrayList<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityOnExposureFactory.doCreateActions[LocalVariableDescriptor]

