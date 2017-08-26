'KotlinQuickFixAction<KtParameter>' @ [34:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtParameter) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtParameter

'parameter' @ [34:39] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.<init>[ValueParameterDescriptorImpl]

'RenameProcessor' @ [42:9] ==> public constructor RenameProcessor(p0: (Project..Project?), @NotNull p1: PsiElement, @NotNull @NonNls p2: String, p3: Boolean, p4: Boolean) defined in com.intellij.refactoring.rename.RenameProcessor[JavaClassConstructorDescriptor]

'project' @ [42:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.invoke[ValueParameterDescriptorImpl]

'element' @ [42:34] ==> protected final val element: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix[PropertyDescriptorImpl]

'newName' @ [42:53] ==> private final val newName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix[PropertyDescriptorImpl]

'run' @ [42:76] ==> public final fun run(): Unit defined in com.intellij.refactoring.rename.RenameProcessor[JavaMethodDescriptor]

'KotlinSingleIntentionActionFactory' @ [45:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [47:29] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [47:40] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [47:51] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameter

'parameter' @ [48:39] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [48:49] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [48:90] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'parameterDescriptor' @ [50:47] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction[LocalVariableDescriptor]

'overriddenDescriptors' @ [51:22] ==> public final val ValueParameterDescriptor.overriddenDescriptors: Collection<ValueParameterDescriptor>[MyPropertyDescriptor]

'map' @ [52:22] ==> public inline fun <T, R> Iterable<ValueParameterDescriptor>.map(transform: (ValueParameterDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> String

'it' @ [52:28] ==> value-parameter it: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [52:31] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [52:36] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'distinct' @ [53:22] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'singleOrNull' @ [54:22] ==> public fun <T> List<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'RenameParameterToMatchOverriddenMethodFix' @ [55:20] ==> public constructor RenameParameterToMatchOverriddenMethodFix(parameter: KtParameter, newName: String) defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix[ClassConstructorDescriptorImpl]

'parameter' @ [55:62] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction[LocalVariableDescriptor]

'parameterFromSuperclassName' @ [55:73] ==> val parameterFromSuperclassName: String defined in org.jetbrains.kotlin.idea.quickfix.RenameParameterToMatchOverriddenMethodFix.Companion.createAction[LocalVariableDescriptor]

