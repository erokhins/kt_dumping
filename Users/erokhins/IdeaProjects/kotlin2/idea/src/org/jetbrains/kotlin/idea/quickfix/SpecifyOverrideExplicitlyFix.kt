'KotlinQuickFixAction<KtClassOrObject>' @ [39:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtClassOrObject) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtClassOrObject

'element' @ [39:43] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.<init>[ValueParameterDescriptorImpl]

'signature' @ [41:54] ==> private final val signature: String defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix[PropertyDescriptorImpl]

'element' @ [46:23] ==> protected final val element: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix[PropertyDescriptorImpl]

'element' @ [47:23] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'analyzeFully' @ [47:31] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [48:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'diagnostics' @ [48:43] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [48:55] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'element' @ [48:66] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'mapNotNull' @ [48:75] ==> public inline fun <T, R : Any> Iterable<Diagnostic>.mapNotNull(transform: (Diagnostic) -> CallableMemberDescriptor?): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R : Any> -> CallableMemberDescriptor

'if (it.factory == Errors.DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE)
                Errors.DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE.cast(it).a
            else
                null' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableMemberDescriptor?, elseBranch: CallableMemberDescriptor?): CallableMemberDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableMemberDescriptor?

'it' @ [49:17] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [49:20] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE' @ [49:38] ==> public final val DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE' @ [50:24] ==> public final val DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [50:66] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'it' @ [50:71] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [50:75] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>.a: (CallableMemberDescriptor..CallableMemberDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <B : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>..kotlin.collections.List<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>?)

'firstOrNull' @ [53:11] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.firstOrNull(predicate: (CallableMemberDescriptor) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'DescriptorRenderer' @ [54:13] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [54:32] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [54:60] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [54:67] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [54:74] ==> private final val signature: String defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix[PropertyDescriptorImpl]

'element' @ [56:27] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'superTypeListEntries' @ [56:35] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'specifier' @ [57:17] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'specifier' @ [58:33] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'typeReference' @ [58:43] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [58:58] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> KotlinType?

'context' @ [58:64] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'TYPE' @ [58:87] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [58:93] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'superType' @ [59:43] ==> val superType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'constructor' @ [59:53] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [59:65] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'delegatedDescriptor' @ [60:44] ==> val delegatedDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'overriddenDescriptors' @ [60:64] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'find' @ [60:86] ==> @InlineOnly public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.find(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [61:21] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [61:24] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'superTypeDescriptor' @ [61:49] ==> val superTypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'specifier' @ [64:42] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'delegateExpression' @ [64:52] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [65:48] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [65:71] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'delegateExpression' @ [65:89] ==> val delegateExpression: KtNameReferenceExpression? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'delegateTargetDescriptor' @ [66:21] ==> val delegateTargetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'delegateTargetDescriptor' @ [67:21] ==> val delegateTargetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'containingDeclaration' @ [67:46] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'let' @ [67:68] ==> @InlineOnly public inline fun <T, R> CallableDescriptor.let(block: (CallableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> Boolean

'it' @ [68:25] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [69:25] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'isPrimary' @ [69:28] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'it' @ [70:25] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [70:28] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'delegatedDescriptor' @ [70:53] ==> val delegatedDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'containingDeclaration' @ [70:73] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DescriptorToSourceUtils' @ [72:45] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [72:69] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'delegateTargetDescriptor' @ [73:29] ==> val delegateTargetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'delegateParameter' @ [74:25] ==> val delegateParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'!' @ [74:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'delegateParameter' @ [74:55] ==> val delegateParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'hasValOrVar' @ [74:73] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'KtPsiFactory' @ [75:39] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [75:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'delegateParameter' @ [76:25] ==> val delegateParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'addModifier' @ [76:43] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [76:64] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delegateParameter' @ [77:25] ==> val delegateParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'addAfter' @ [77:43] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'factory' @ [77:52] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'createValKeyword' @ [77:60] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'delegateParameter' @ [77:80] ==> val delegateParameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'modifierList' @ [77:98] ==> public final val KtParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'OverrideMemberChooserObject' @ [81:51] ==> public companion object defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject[FakeCallableDescriptorForObject]

'create' @ [81:79] ==> public final fun create(project: Project, descriptor: CallableMemberDescriptor, immediateSuper: CallableMemberDescriptor, bodyType: OverrideMemberChooserObject.BodyType, preferConstructorParameter: Boolean = ...): OverrideMemberChooserObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [82:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'delegatedDescriptor' @ [82:34] ==> val delegatedDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'overriddenDescriptor' @ [82:55] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'OverrideMemberChooserObject' @ [83:25] ==> public companion object defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject[FakeCallableDescriptorForObject]

'Delegate' @ [83:62] ==> public constructor Delegate(receiverName: String) defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.BodyType.Delegate[DeserializedClassConstructorDescriptor]

'delegateTargetDescriptor' @ [83:71] ==> val delegateTargetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'name' @ [83:96] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [83:101] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'overrideMemberChooserObject' @ [85:30] ==> val overrideMemberChooserObject: OverrideMemberChooserObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'generateMember' @ [85:58] ==> public fun OverrideMemberChooserObject.generateMember(project: Project, copyDoc: Boolean): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.core.overrideImplement[DeserializedSimpleFunctionDescriptor]

'project' @ [85:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'element' @ [86:38] ==> val element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'addDeclaration' @ [86:46] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtCallableDeclaration): KtCallableDeclaration defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtCallableDeclaration

'member' @ [86:61] ==> val member: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'ShortenReferences' @ [87:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [87:35] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [87:43] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'insertedMember' @ [87:51] ==> val insertedMember: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [94:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE' @ [96:45] ==> public final val DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [96:87] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [96:92] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[ValueParameterDescriptorImpl]

'hidesOverrideError' @ [97:25] ==> val hidesOverrideError: DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[LocalVariableDescriptor]

'psiElement' @ [97:44] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>.psiElement: (KtClassOrObject..KtClassOrObject?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <B : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>..kotlin.collections.List<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>?)

'klass' @ [98:17] ==> val klass: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[LocalVariableDescriptor]

'superTypeListEntries' @ [98:23] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'any' @ [98:44] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.any(predicate: (KtSuperTypeListEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'it' @ [99:17] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [99:52] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'delegateExpression' @ [99:55] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'hidesOverrideError' @ [103:34] ==> val hidesOverrideError: DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[LocalVariableDescriptor]

'a' @ [103:53] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>.a: (CallableMemberDescriptor..CallableMemberDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <B : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>..kotlin.collections.List<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>?)

'SpecifyOverrideExplicitlyFix' @ [104:20] ==> public constructor SpecifyOverrideExplicitlyFix(element: KtClassOrObject, signature: String) defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix[ClassConstructorDescriptorImpl]

'klass' @ [104:49] ==> val klass: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[LocalVariableDescriptor]

'DescriptorRenderer' @ [104:56] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [104:75] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [104:103] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'properOverride' @ [104:110] ==> val properOverride: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.SpecifyOverrideExplicitlyFix.Companion.createAction[LocalVariableDescriptor]

