'stub' @ [27:9] ==> value-parameter stub: KotlinCallableStubBase<TDeclaration> defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[ValueParameterDescriptorImpl]

'isExtension' @ [27:14] ==> public abstract fun isExtension(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinCallableStubBase[DeserializedSimpleFunctionDescriptor]

'stub' @ [28:27] ==> value-parameter stub: KotlinCallableStubBase<TDeclaration> defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[ValueParameterDescriptorImpl]

'psi' @ [28:32] ==> public final val <TDeclaration : KtCallableDeclaration> KotlinCallableStubBase<TDeclaration>.psi: (TDeclaration..TDeclaration?)[MyPropertyDescriptor]
Inferred types:
    <TDeclaration : KtCallableDeclaration> -> TDeclaration

'declaration' @ [29:39] ==> val declaration: (TDeclaration..TDeclaration?) defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[LocalVariableDescriptor]

'receiverTypeReference' @ [29:51] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'containingTypeReference' @ [30:9] ==> val containingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[LocalVariableDescriptor]

'typeElement' @ [30:33] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'index' @ [30:46] ==> private fun KtTypeElement.index(declaration: KtTypeParameterListOwner, containingTypeReference: KtTypeReference, occurrence: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.stubindex in file IndexUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [30:52] ==> val declaration: (TDeclaration..TDeclaration?) defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[LocalVariableDescriptor]

'containingTypeReference' @ [30:65] ==> val containingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[LocalVariableDescriptor]

'declaration' @ [31:24] ==> val declaration: (TDeclaration..TDeclaration?) defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[LocalVariableDescriptor]

'name' @ [31:36] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'sink' @ [32:13] ==> value-parameter sink: IndexSink defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension[ValueParameterDescriptorImpl]

'occurrence' @ [32:18] ==> public abstract fun <Psi : (PsiElement..PsiElement?), K : (Any..Any?)> occurrence(@NotNull p0: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>, @NotNull p1: String): Unit defined in com.intellij.psi.stubs.IndexSink[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'INSTANCE' @ [32:73] ==> public final val INSTANCE: KotlinTopLevelExtensionsByReceiverTypeIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex.Companion[PropertyDescriptorImpl]

'key' @ [32:82] ==> public final val KotlinTopLevelExtensionsByReceiverTypeIndex.key: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>[MyPropertyDescriptor]

'buildKey' @ [33:73] ==> public final fun buildKey(receiverTypeName: String, callableName: String): String defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelExtensionsByReceiverTypeIndex.Companion[SimpleFunctionDescriptorImpl]

'typeName' @ [33:82] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [33:92] ==> val name: String defined in org.jetbrains.kotlin.idea.stubindex.indexTopLevelExtension.<anonymous>[LocalVariableDescriptor]

'stub' @ [39:23] ==> value-parameter stub: KotlinTypeAliasStub defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[ValueParameterDescriptorImpl]

'psi' @ [39:28] ==> public final val KotlinTypeAliasStub.psi: (KtTypeAlias..KtTypeAlias?)[MyPropertyDescriptor]

'declaration' @ [40:25] ==> val declaration: (KtTypeAlias..KtTypeAlias?) defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[LocalVariableDescriptor]

'getTypeReference' @ [40:37] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'typeReference' @ [41:23] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[LocalVariableDescriptor]

'typeElement' @ [41:37] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeElement' @ [42:5] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[LocalVariableDescriptor]

'index' @ [42:17] ==> private fun KtTypeElement.index(declaration: KtTypeParameterListOwner, containingTypeReference: KtTypeReference, occurrence: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.stubindex in file IndexUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [42:23] ==> val declaration: (KtTypeAlias..KtTypeAlias?) defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[LocalVariableDescriptor]

'typeReference' @ [42:36] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[LocalVariableDescriptor]

'sink' @ [43:9] ==> value-parameter sink: IndexSink defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion[ValueParameterDescriptorImpl]

'occurrence' @ [43:14] ==> public abstract fun <Psi : (PsiElement..PsiElement?), K : (Any..Any?)> occurrence(@NotNull p0: StubIndexKey<(String..String?), (KtTypeAlias..KtTypeAlias?)>, @NotNull p1: String): Unit defined in com.intellij.psi.stubs.IndexSink[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeAlias..org.jetbrains.kotlin.psi.KtTypeAlias?)
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'KEY' @ [43:66] ==> public final val KEY: StubIndexKey<(String..String?), (KtTypeAlias..KtTypeAlias?)> defined in org.jetbrains.kotlin.idea.stubindex.KotlinTypeAliasByExpansionShortNameIndex.Companion[PropertyDescriptorImpl]

'typeName' @ [43:71] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.stubindex.indexTypeAliasExpansion.<anonymous>[ValueParameterDescriptorImpl]

'when (this) {
        is KtUserType -> {
            val referenceName = referencedName ?: return

            val typeParameter = declaration.typeParameters.firstOrNull { it.name == referenceName }
            if (typeParameter != null) {
                val bound = typeParameter.extendsBound
                if (bound != null) {
                    bound.typeElement?.index(declaration, containingTypeReference, occurrence)
                }
                else {
                    occurrence("Any")
                }
                return
            }

            occurrence(referenceName)

            aliasImportMap()[referenceName].forEach { occurrence(it) }
        }

        is KtNullableType -> innerType?.index(declaration, containingTypeReference, occurrence)

        is KtFunctionType -> {
            val arity = parameters.size + (if (receiverTypeReference != null) 1 else 0)
            val suspendPrefix =
                    if (containingTypeReference.modifierList?.hasModifier(KtTokens.SUSPEND_KEYWORD) == true)
                        "Suspend"
                    else
                        ""
            occurrence("${suspendPrefix}Function$arity")
        }

        is KtDynamicType -> occurrence("Any")

        else -> error("Unsupported type: $this")
    }' @ [52:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?, entry4: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'this' @ [52:11] ==> <this> defined in org.jetbrains.kotlin.idea.stubindex.index[ReceiverParameterDescriptorImpl]

'referencedName' @ [54:33] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'declaration' @ [56:33] ==> value-parameter declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'typeParameters' @ [56:45] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [56:60] ==> public inline fun <T> Iterable<(KtTypeParameter..KtTypeParameter?)>.firstOrNull(predicate: ((KtTypeParameter..KtTypeParameter?)) -> Boolean): KtTypeParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)

'it' @ [56:74] ==> value-parameter it: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.stubindex.index.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:77] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'referenceName' @ [56:85] ==> val referenceName: String defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'typeParameter' @ [57:17] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'typeParameter' @ [58:29] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'extendsBound' @ [58:43] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'if (bound != null) {
                    bound.typeElement?.index(declaration, containingTypeReference, occurrence)
                }
                else {
                    occurrence("Any")
                }' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'bound' @ [59:21] ==> val bound: KtTypeReference? defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'bound' @ [60:21] ==> val bound: KtTypeReference? defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'typeElement' @ [60:27] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'index' @ [60:40] ==> private fun KtTypeElement.index(declaration: KtTypeParameterListOwner, containingTypeReference: KtTypeReference, occurrence: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.stubindex in file IndexUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [60:46] ==> value-parameter declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'containingTypeReference' @ [60:59] ==> value-parameter containingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'occurrence' @ [60:84] ==> value-parameter occurrence: (String) -> Unit defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'invoke' @ [63:21] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [68:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'referenceName' @ [68:24] ==> val referenceName: String defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'aliasImportMap' @ [70:13] ==> public fun KtUserType.aliasImportMap(): Multimap<String, String> defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'referenceName' @ [70:30] ==> val referenceName: String defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'forEach' @ [70:45] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'invoke' @ [70:55] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [70:66] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.stubindex.index.<anonymous>[ValueParameterDescriptorImpl]

'innerType' @ [73:30] ==> public final val KtNullableType.innerType: KtTypeElement?[MyPropertyDescriptor]

'index' @ [73:41] ==> private fun KtTypeElement.index(declaration: KtTypeParameterListOwner, containingTypeReference: KtTypeReference, occurrence: (String) -> Unit): Unit defined in org.jetbrains.kotlin.idea.stubindex in file IndexUtils.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [73:47] ==> value-parameter declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'containingTypeReference' @ [73:60] ==> value-parameter containingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'occurrence' @ [73:85] ==> value-parameter occurrence: (String) -> Unit defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'parameters' @ [76:25] ==> public final val KtFunctionType.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'size' @ [76:36] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'if (receiverTypeReference != null) 1 else 0' @ [76:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'receiverTypeReference' @ [76:48] ==> public final val KtFunctionType.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'if (containingTypeReference.modifierList?.hasModifier(KtTokens.SUSPEND_KEYWORD) == true)
                        "Suspend"
                    else
                        ""' @ [78:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingTypeReference' @ [78:25] ==> value-parameter containingTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.stubindex.index[ValueParameterDescriptorImpl]

'modifierList' @ [78:49] ==> public final val KtTypeReference.modifierList: KtModifierList?[MyPropertyDescriptor]

'hasModifier' @ [78:63] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'SUSPEND_KEYWORD' @ [78:84] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'invoke' @ [82:13] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'suspendPrefix' @ [82:27] ==> val suspendPrefix: String defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'arity' @ [82:50] ==> val arity: Int defined in org.jetbrains.kotlin.idea.stubindex.index[LocalVariableDescriptor]

'invoke' @ [85:29] ==> public abstract operator fun invoke(p1: String): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'error' @ [87:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [87:43] ==> <this> defined in org.jetbrains.kotlin.idea.stubindex.index[ReceiverParameterDescriptorImpl]

'stub' @ [92:16] ==> value-parameter stub: KotlinCallableStubBase<*> defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[ValueParameterDescriptorImpl]

'name' @ [92:21] ==> public final val <TDeclaration : KtCallableDeclaration> KotlinCallableStubBase<out KtCallableDeclaration>.name: String?[MyPropertyDescriptor]
Inferred types:
    <TDeclaration : KtCallableDeclaration> -> Captured(*)

'stub' @ [94:28] ==> value-parameter stub: KotlinCallableStubBase<*> defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[ValueParameterDescriptorImpl]

'modifierList' @ [94:33] ==> private val KotlinStubWithFqName<*>.modifierList: KotlinModifierListStub? defined in org.jetbrains.kotlin.idea.stubindex in file IndexUtils.kt[PropertyDescriptorImpl]

'!' @ [96:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifierListStub' @ [96:10] ==> val modifierListStub: KotlinModifierListStub defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[LocalVariableDescriptor]

'hasModifier' @ [96:27] ==> public abstract fun hasModifier(modifierToken: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinModifierListStub[DeserializedSimpleFunctionDescriptor]

'INTERNAL_KEYWORD' @ [96:48] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'stub' @ [98:9] ==> value-parameter stub: KotlinCallableStubBase<*> defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[ValueParameterDescriptorImpl]

'isTopLevel' @ [98:14] ==> public abstract fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinCallableStubBase[DeserializedSimpleFunctionDescriptor]

'modifierListStub' @ [100:9] ==> val modifierListStub: KotlinModifierListStub defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[LocalVariableDescriptor]

'hasModifier' @ [100:26] ==> public abstract fun hasModifier(modifierToken: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinModifierListStub[DeserializedSimpleFunctionDescriptor]

'OPEN_KEYWORD' @ [100:47] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifierListStub' @ [101:12] ==> val modifierListStub: KotlinModifierListStub defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[LocalVariableDescriptor]

'hasModifier' @ [101:29] ==> public abstract fun hasModifier(modifierToken: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.stubs.KotlinModifierListStub[DeserializedSimpleFunctionDescriptor]

'ABSTRACT_KEYWORD' @ [101:50] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'sink' @ [102:9] ==> value-parameter sink: IndexSink defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[ValueParameterDescriptorImpl]

'occurrence' @ [102:14] ==> public abstract fun <Psi : (PsiElement..PsiElement?), K : (Any..Any?)> occurrence(@NotNull p0: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>, @NotNull p1: String): Unit defined in com.intellij.psi.stubs.IndexSink[JavaMethodDescriptor]
Inferred types:
    <Psi : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtCallableDeclaration..org.jetbrains.kotlin.psi.KtCallableDeclaration?)
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'Instance' @ [102:72] ==> @JvmField public final val Instance: KotlinOverridableInternalMembersShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinOverridableInternalMembersShortNameIndex.Companion[PropertyDescriptorImpl]

'key' @ [102:81] ==> public final val KotlinOverridableInternalMembersShortNameIndex.key: StubIndexKey<(String..String?), (KtCallableDeclaration..KtCallableDeclaration?)>[MyPropertyDescriptor]

'name' @ [102:86] ==> val name: String defined in org.jetbrains.kotlin.idea.stubindex.indexInternals[LocalVariableDescriptor]

'findChildStubByType' @ [107:13] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtDeclarationModifierList..KtDeclarationModifierList?)>): StubElement<(KtDeclarationModifierList..KtDeclarationModifierList?)>? defined in org.jetbrains.kotlin.psi.stubs.KotlinStubWithFqName[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclarationModifierList..org.jetbrains.kotlin.psi.KtDeclarationModifierList?)

'MODIFIER_LIST' @ [107:52] ==> public final val MODIFIER_LIST: (KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>..KtModifierListElementType<(KtDeclarationModifierList..KtDeclarationModifierList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

