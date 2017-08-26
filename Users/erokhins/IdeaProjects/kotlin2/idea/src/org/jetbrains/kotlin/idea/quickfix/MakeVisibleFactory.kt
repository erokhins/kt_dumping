'KotlinIntentionActionsFactory' @ [38:29] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'diagnostic' @ [40:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [40:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'emptyList' @ [40:69] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'element' @ [41:23] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'analyze' @ [41:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [41:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [42:27] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'get' @ [42:35] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..ReadOnlySlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?), p1: (KtFile..KtFile?)): PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor..org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor?)

'FILE_TO_PACKAGE_FRAGMENT' @ [42:54] ==> public final val FILE_TO_PACKAGE_FRAGMENT: (WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [42:80] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'containingKtFile' @ [42:88] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'module' @ [42:107] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'Suppress' @ [44:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'diagnostic' @ [45:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[ValueParameterDescriptorImpl]

'factory' @ [45:34] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'factory' @ [46:26] ==> val factory: DiagnosticFactory3<*, DeclarationDescriptor, *, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'cast' @ [46:34] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters3<out (PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), out (Any..Any?), (DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'diagnostic' @ [46:39] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[ValueParameterDescriptorImpl]

'c' @ [46:51] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<out (PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), out (Any..Any?), (DeclarationDescriptor..DeclarationDescriptor?)>.c: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?))
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)
    <B : (Any..Any?)> -> Captured(out (kotlin.Any..kotlin.Any?))
    <C : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'emptyList' @ [46:103] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'DescriptorToSourceUtils' @ [47:27] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [47:51] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [47:75] ==> val descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'emptyList' @ [47:121] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'getContainingModule' @ [49:38] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [49:58] ==> val descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'when (descriptor.visibility) {
            PRIVATE, INVISIBLE_FAKE -> mutableListOf(PUBLIC).apply {
                if (module == usageModule) add(INTERNAL)
                val superClasses = (element.containingClass()?.descriptor as? ClassDescriptor)?.getAllSuperclassesWithoutAny()
                if (superClasses?.contains(declaration.containingClass()?.descriptor) == true) add(PROTECTED)
            }
            else -> listOf(PUBLIC)
        }' @ [50:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Visibility>, entry1: List<Visibility>): List<Visibility>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Visibility>

'descriptor' @ [50:40] ==> val descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'visibility' @ [50:51] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'PRIVATE' @ [51:13] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'INVISIBLE_FAKE' @ [51:22] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'mutableListOf' @ [51:40] ==> public fun <T> mutableListOf(vararg elements: Visibility): MutableList<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'PUBLIC' @ [51:54] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'apply' @ [51:62] ==> @InlineOnly public inline fun <T> MutableList<Visibility>.apply(block: MutableList<Visibility>.() -> Unit): MutableList<Visibility> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<Visibility>

'module' @ [52:21] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'usageModule' @ [52:31] ==> val usageModule: ModuleDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'add' @ [52:44] ==> public abstract fun add(element: Visibility): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'INTERNAL' @ [52:48] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'element' @ [53:37] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'containingClass' @ [53:45] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [53:64] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'getAllSuperclassesWithoutAny' @ [53:97] ==> public fun ClassDescriptor.getAllSuperclassesWithoutAny(): SmartList<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'superClasses' @ [54:21] ==> val superClasses: SmartList<ClassDescriptor>? defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions.<anonymous>[LocalVariableDescriptor]

'contains' @ [54:35] ==> public operator fun <@OnlyInputTypes T> Iterable<DeclarationDescriptor?>.contains(element: DeclarationDescriptor?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> DeclarationDescriptor?

'declaration' @ [54:44] ==> val declaration: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'containingClass' @ [54:56] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [54:75] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'add' @ [54:96] ==> public abstract fun add(element: Visibility): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'PROTECTED' @ [54:100] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'listOf' @ [56:21] ==> public fun <T> listOf(element: Visibility): List<Visibility> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility

'PUBLIC' @ [56:28] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'targetVisibilities' @ [59:16] ==> val targetVisibilities: List<Visibility> defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'mapNotNull' @ [59:35] ==> public inline fun <T, R : Any> Iterable<Visibility>.mapNotNull(transform: (Visibility) -> IntentionAction?): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Visibility
    <R : Any> -> IntentionAction

'ChangeVisibilityFix' @ [59:48] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityFix[FakeCallableDescriptorForObject]

'create' @ [59:68] ==> public final fun create(declaration: KtModifierListOwner, descriptor: DeclarationDescriptorWithVisibility, targetVisibility: Visibility): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVisibilityFix.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [59:75] ==> val declaration: KtModifierListOwner defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'descriptor' @ [59:88] ==> val descriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions[LocalVariableDescriptor]

'it' @ [59:100] ==> value-parameter it: Visibility defined in org.jetbrains.kotlin.idea.quickfix.MakeVisibleFactory.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

