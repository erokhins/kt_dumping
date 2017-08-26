'KotlinQuickFixAction<KtExpression>' @ [51:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [51:40] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.<init>[ValueParameterDescriptorImpl]

'originalName' @ [55:83] ==> public final val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'newNameQuoted' @ [55:96] ==> public final val String.newNameQuoted: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'if (!isProperty) "(...)" else ""' @ [55:112] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [55:116] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProperty' @ [55:117] ==> public final val isProperty: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'element' @ [58:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'!' @ [59:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPublishedMemberAlreadyExists' @ [59:14] ==> public final val isPublishedMemberAlreadyExists: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'classOwnerPointer' @ [60:30] ==> public final val classOwnerPointer: SmartPsiElementPointer<KtClass> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'element' @ [60:48] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtClass>.element: KtClass?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtClass

'if (isProperty) {
                        KtPsiFactory(classOwner).createProperty(
                                "@kotlin.PublishedApi\n" +
                                "internal " + newSignature +
                                "\n" +
                                "get() = $originalName\n" +
                                if (isVar) "set(value) { $originalName = value }" else ""
                        )

                    }
                    else {
                        KtPsiFactory(classOwner).createFunction(
                                "@kotlin.PublishedApi\n" +
                                "internal " + newSignature +
                                " = $originalName(${paramNames.keys.joinToString(", ") { it }})"
                        )
                    }' @ [62:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDeclaration, elseBranch: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDeclaration

'isProperty' @ [62:25] ==> public final val isProperty: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [63:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'classOwner' @ [63:38] ==> val classOwner: KtClass defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'createProperty' @ [63:50] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'+' @ [64:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newSignature' @ [65:47] ==> public final val newSignature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'originalName' @ [67:43] ==> public final val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'if (isVar) "set(value) { $originalName = value }" else ""' @ [68:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isVar' @ [68:37] ==> public final val isVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'originalName' @ [68:59] ==> public final val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [73:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'classOwner' @ [73:38] ==> val classOwner: KtClass defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'createFunction' @ [73:50] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'+' @ [74:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'newSignature' @ [75:47] ==> public final val newSignature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'originalName' @ [76:38] ==> public final val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'paramNames' @ [76:53] ==> public final val paramNames: Map<String, String> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'keys' @ [76:64] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [76:69] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [76:90] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'ShortenReferences' @ [80:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [80:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [80:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'classOwner' @ [80:47] ==> val classOwner: KtClass defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'addDeclaration' @ [80:58] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtDeclaration): KtDeclaration defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtDeclaration

'newMember' @ [80:73] ==> val newMember: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'element' @ [82:9] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'replace' @ [82:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [82:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [82:38] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.invoke[LocalVariableDescriptor]

'createExpression' @ [82:47] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'originalName' @ [82:64] ==> public final val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[PropertyDescriptorImpl]

'newNameQuoted' @ [82:77] ==> public final val String.newNameQuoted: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [85:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'IdeDescriptorRenderers' @ [86:41] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [86:64] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [86:76] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'defaultParameterValueRenderer' @ [87:13] ==> public abstract var defaultParameterValueRenderer: ((ValueParameterDescriptor) -> String)? defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'startFromDeclarationKeyword' @ [88:13] ==> public abstract var startFromDeclarationKeyword: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'withoutReturnType' @ [89:13] ==> public abstract var withoutReturnType: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'diagnostic' @ [93:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [93:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'cast' @ [94:48] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?)>?)): DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>..org.jetbrains.kotlin.diagnostics.DiagnosticWithParameters1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?)

'diagnostic' @ [94:53] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[ValueParameterDescriptorImpl]

'PROTECTED_CALL_FROM_PUBLIC_INLINE' @ [94:72] ==> public final val PROTECTED_CALL_FROM_PUBLIC_INLINE: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'a' @ [94:107] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>.a: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'let' @ [94:109] ==> @InlineOnly public inline fun <T, R> CallableDescriptor.let(block: (CallableDescriptor) -> CallableDescriptor): CallableDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> CallableDescriptor

'if (it is CallableMemberDescriptor) DescriptorUtils.getDirectMember(it) else it' @ [95:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableDescriptor, elseBranch: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableDescriptor

'it' @ [95:21] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'getDirectMember' @ [95:69] ==> @NotNull public open fun getDirectMember(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [95:85] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [95:94] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [97:30] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'descriptor' @ [98:25] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'descriptor' @ [98:61] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'isVar' @ [98:72] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'signatureRenderer' @ [100:29] ==> private final val signatureRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'render' @ [100:47] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [100:54] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'descriptor' @ [101:32] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'name' @ [101:43] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [101:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'if (isProperty) {
                        signature.replaceFirst("$originalName:", "${originalName.newNameQuoted}:")
                    }
                    else {
                        signature.replaceFirst("$originalName(", "${originalName.newNameQuoted}(")
                    }' @ [103:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isProperty' @ [103:25] ==> val isProperty: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'signature' @ [104:25] ==> val signature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'replaceFirst' @ [104:35] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'originalName' @ [104:50] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'originalName' @ [104:69] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'newNameQuoted' @ [104:82] ==> public final val String.newNameQuoted: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'signature' @ [107:25] ==> val signature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'replaceFirst' @ [107:35] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'originalName' @ [107:50] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'originalName' @ [107:69] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'newNameQuoted' @ [107:82] ==> public final val String.newNameQuoted: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'descriptor' @ [109:36] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'valueParameters' @ [109:47] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'associate' @ [109:63] ==> public inline fun <T, K, V> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.associate(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> String
    <V> -> String

'it' @ [109:75] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [109:78] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [109:83] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [109:97] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [109:100] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'getJetTypeFqName' @ [109:105] ==> public fun KotlinType.getJetTypeFqName(printTypeArguments: Boolean): String defined in org.jetbrains.kotlin.js.descriptorUtils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [110:35] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'containingDeclaration' @ [110:46] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [111:26] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'source' @ [111:42] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [111:49] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'identifier' @ [113:32] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'originalName' @ [113:43] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'newName' @ [113:56] ==> public final val String.newName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'classDescriptor' @ [114:42] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [114:58] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getDescriptorsFiltered' @ [114:83] ==> public fun MemberScope.getDescriptorsFiltered(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes[DeserializedSimpleFunctionDescriptor]

'it' @ [115:17] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'newName' @ [115:23] ==> val newName: Name defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'contributedDescriptors' @ [117:50] ==> val contributedDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'filterIsInstance' @ [117:73] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'any' @ [117:118] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.any(predicate: (CallableMemberDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'signatureRenderer' @ [118:17] ==> private final val signatureRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

'render' @ [118:35] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [118:42] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'newSignature' @ [118:49] ==> val newSignature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'ReplaceProtectedToPublishedApiCallFix' @ [121:20] ==> public constructor ReplaceProtectedToPublishedApiCallFix(element: KtExpression, classOwnerPointer: SmartPsiElementPointer<KtClass>, originalName: String, paramNames: Map<String, String>, newSignature: String, isProperty: Boolean, isVar: Boolean, isPublishedMemberAlreadyExists: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix[ClassConstructorDescriptorImpl]

'psiElement' @ [122:21] ==> val psiElement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'source' @ [122:33] ==> val source: KtClass defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'createSmartPointer' @ [122:40] ==> public fun <E : PsiElement> KtClass.createSmartPointer(): SmartPsiElementPointer<KtClass> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtClass

'originalName' @ [122:62] ==> val originalName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'paramNameAndType' @ [122:76] ==> val paramNameAndType: Map<String, String> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'newSignature' @ [122:94] ==> val newSignature: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'isProperty' @ [123:21] ==> val isProperty: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'isVar' @ [123:33] ==> val isVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'isPublishedMemberAlreadyExists' @ [123:40] ==> val isPublishedMemberAlreadyExists: Boolean defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.createAction[LocalVariableDescriptor]

'this' @ [128:31] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion.newName[ReceiverParameterDescriptorImpl]

'newName' @ [131:28] ==> public final val String.newName: String defined in org.jetbrains.kotlin.idea.quickfix.replaceWith.ReplaceProtectedToPublishedApiCallFix.Companion[PropertyDescriptorImpl]

