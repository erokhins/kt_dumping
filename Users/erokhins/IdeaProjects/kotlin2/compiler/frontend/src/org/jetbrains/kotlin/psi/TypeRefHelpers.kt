'declaration' @ [29:12] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.getTypeReference[ValueParameterDescriptorImpl]

'firstChild' @ [29:24] ==> public final val KtCallableDeclaration.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [29:37] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'dropWhile' @ [30:14] ==> public fun <T> Sequence<PsiElement>.dropWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [30:26] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.getTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [30:29] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [30:36] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COLON' @ [30:60] ==> public final val COLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'firstIsInstanceOrNull' @ [31:14] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtTypeReference? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtTypeReference

'getTypeReference' @ [35:22] ==> public fun getTypeReference(declaration: KtCallableDeclaration): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers in file TypeRefHelpers.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [35:39] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'if (typeRef != null) {
        return if (oldTypeRef != null) {
            oldTypeRef.replace(typeRef) as KtTypeReference
        }
        else {
            val anchor = addAfter
                         ?: declaration.nameIdentifier?.siblings(forward = true)?.firstOrNull { it is PsiErrorElement }
                         ?: (declaration as? KtParameter)?.destructuringDeclaration
            val newTypeRef = declaration.addAfter(typeRef, anchor) as KtTypeReference
            declaration.addAfter(KtPsiFactory(declaration.project).createColon(), anchor)
            newTypeRef
        }
    }
    else {
        if (oldTypeRef != null) {
            val colon = declaration.colon!!
            val removeFrom = colon.prevSibling as? PsiWhiteSpace ?: colon
            declaration.deleteChildRange(removeFrom, oldTypeRef)
        }
        return null
    }' @ [36:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'typeRef' @ [36:9] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'if (oldTypeRef != null) {
            oldTypeRef.replace(typeRef) as KtTypeReference
        }
        else {
            val anchor = addAfter
                         ?: declaration.nameIdentifier?.siblings(forward = true)?.firstOrNull { it is PsiErrorElement }
                         ?: (declaration as? KtParameter)?.destructuringDeclaration
            val newTypeRef = declaration.addAfter(typeRef, anchor) as KtTypeReference
            declaration.addAfter(KtPsiFactory(declaration.project).createColon(), anchor)
            newTypeRef
        }' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference?, elseBranch: KtTypeReference?): KtTypeReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference?

'oldTypeRef' @ [37:20] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [38:13] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'replace' @ [38:24] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'typeRef' @ [38:32] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'addAfter' @ [41:26] ==> value-parameter addAfter: PsiElement? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'declaration' @ [42:29] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'nameIdentifier' @ [42:41] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'siblings' @ [42:57] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [42:83] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [42:97] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [43:30] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [43:60] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'declaration' @ [44:30] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'addAfter' @ [44:42] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'typeRef' @ [44:51] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'anchor' @ [44:60] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'declaration' @ [45:13] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'addAfter' @ [45:25] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'KtPsiFactory' @ [45:34] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'declaration' @ [45:47] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'project' @ [45:59] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'createColon' @ [45:68] ==> public final fun createColon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'anchor' @ [45:83] ==> val anchor: PsiElement? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'newTypeRef' @ [46:13] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [50:13] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'declaration' @ [51:25] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'colon' @ [51:37] ==> public final val KtCallableDeclaration.colon: PsiElement?[MyPropertyDescriptor]

'colon' @ [52:30] ==> val colon: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'prevSibling' @ [52:36] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'colon' @ [52:69] ==> val colon: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'declaration' @ [53:13] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[ValueParameterDescriptorImpl]

'deleteChildRange' @ [53:25] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'removeFrom' @ [53:42] ==> val removeFrom: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [53:54] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setTypeReference[LocalVariableDescriptor]

'typeRef' @ [64:27] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'typeRef' @ [64:46] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'typeElement' @ [64:54] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'!' @ [64:87] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeRef' @ [64:88] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'hasParentheses' @ [64:96] ==> public final fun hasParentheses(): Boolean defined in org.jetbrains.kotlin.psi.KtTypeReference[SimpleFunctionDescriptorImpl]

'invoke' @ [65:22] ==> public abstract operator fun T.invoke(): KtTypeReference? defined in kotlin.Function1[FunctionInvokeDescriptor]

'if (typeRef != null) {
        val newTypeRef =
                if (oldTypeRef != null) {
                    oldTypeRef.replace(typeRef) as KtTypeReference
                }
                else {
                    val newTypeRef = addReceiverTypeReference(typeRef)
                    addAfter(KtPsiFactory(project).createDot(), newTypeRef.parentsWithSelf.first { it.parent == this })
                    newTypeRef
                }
        if (needParentheses) {
            val argList = KtPsiFactory(project).createCallArguments("()")
            newTypeRef.addBefore(argList.leftParenthesis!!, newTypeRef.firstChild)
            newTypeRef.add(argList.rightParenthesis!!)
        }
        return newTypeRef
    }
    else {
        if (oldTypeRef != null) {
            val dotSibling = oldTypeRef.parent as? KtFunctionTypeReceiver ?: oldTypeRef
            val dot = dotSibling.siblings(forward = true).firstOrNull { it.node.elementType == KtTokens.DOT }
            deleteChildRange(dotSibling, dot ?: dotSibling)
        }
        return null
    }' @ [66:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'typeRef' @ [66:9] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'if (oldTypeRef != null) {
                    oldTypeRef.replace(typeRef) as KtTypeReference
                }
                else {
                    val newTypeRef = addReceiverTypeReference(typeRef)
                    addAfter(KtPsiFactory(project).createDot(), newTypeRef.parentsWithSelf.first { it.parent == this })
                    newTypeRef
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference, elseBranch: KtTypeReference): KtTypeReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference

'oldTypeRef' @ [68:21] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [69:21] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'replace' @ [69:32] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'typeRef' @ [69:40] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'invoke' @ [72:38] ==> public abstract operator fun T.invoke(typeRef: @ParameterName KtTypeReference): KtTypeReference defined in kotlin.Function2[FunctionInvokeDescriptor]

'typeRef' @ [72:63] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ValueParameterDescriptorImpl]

'addAfter' @ [73:21] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtPsiFactory' @ [73:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [73:43] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'createDot' @ [73:52] ==> public final fun createDot(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'newTypeRef' @ [73:65] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'parentsWithSelf' @ [73:76] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'first' @ [73:92] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [73:100] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [73:103] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [73:113] ==> <this> defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[ReceiverParameterDescriptorImpl]

'newTypeRef' @ [74:21] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'needParentheses' @ [76:13] ==> val needParentheses: Boolean defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'KtPsiFactory' @ [77:27] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [77:40] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'createCallArguments' @ [77:49] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'newTypeRef' @ [78:13] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'addBefore' @ [78:24] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'argList' @ [78:34] ==> val argList: KtValueArgumentList defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'leftParenthesis' @ [78:42] ==> public final val KtValueArgumentList.leftParenthesis: PsiElement?[MyPropertyDescriptor]

'newTypeRef' @ [78:61] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'firstChild' @ [78:72] ==> public final val KtTypeReference.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'newTypeRef' @ [79:13] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'add' @ [79:24] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'argList' @ [79:28] ==> val argList: KtValueArgumentList defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'rightParenthesis' @ [79:36] ==> public final val KtValueArgumentList.rightParenthesis: PsiElement?[MyPropertyDescriptor]

'newTypeRef' @ [81:16] ==> val newTypeRef: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [84:13] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'oldTypeRef' @ [85:30] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'parent' @ [85:41] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'oldTypeRef' @ [85:78] ==> val oldTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'dotSibling' @ [86:23] ==> val dotSibling: KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)> defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'siblings' @ [86:34] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [86:59] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [86:73] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [86:76] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [86:81] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'DOT' @ [86:105] ==> public final val DOT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'deleteChildRange' @ [87:13] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'dotSibling' @ [87:30] ==> val dotSibling: KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)> defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'dot' @ [87:42] ==> val dot: PsiElement? defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'dotSibling' @ [87:49] ==> val dotSibling: KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>..KtElementImplStub<out (KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>..KotlinPlaceHolderStub<out (KtElementImplStub<*>..KtElementImplStub<*>?)>?)>?)>?)> defined in org.jetbrains.kotlin.psi.typeRefHelpers.doSetReceiverTypeReference[LocalVariableDescriptor]

'doSetReceiverTypeReference' @ [94:9] ==> private inline fun <T : KtElement> KtCallableDeclaration.doSetReceiverTypeReference(typeRef: KtTypeReference?, getReceiverTypeReference: KtCallableDeclaration.() -> KtTypeReference?, addReceiverTypeReference: KtCallableDeclaration.(typeRef: KtTypeReference) -> KtTypeReference): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtCallableDeclaration

'typeRef' @ [95:17] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [96:19] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'this' @ [97:19] ==> <this> defined in org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference.<anonymous>[ReceiverParameterDescriptorImpl]

'addBefore' @ [97:24] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'it' @ [97:34] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'nameIdentifier' @ [97:38] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'valueParameterList' @ [97:56] ==> public final val KtCallableDeclaration.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'doSetReceiverTypeReference' @ [101:9] ==> private inline fun <T : KtElement> KtFunctionType.doSetReceiverTypeReference(typeRef: KtTypeReference?, getReceiverTypeReference: KtFunctionType.() -> KtTypeReference?, addReceiverTypeReference: KtFunctionType.(typeRef: KtTypeReference) -> KtTypeReference): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtFunctionType

'typeRef' @ [102:17] ==> value-parameter typeRef: KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [103:19] ==> public final val KtFunctionType.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'addBefore' @ [105:22] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunctionType[JavaMethodDescriptor]

'KtPsiFactory' @ [105:32] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [105:45] ==> public final val KtFunctionType.project: Project[MyPropertyDescriptor]

'createFunctionTypeReceiver' @ [105:54] ==> public final fun createFunctionTypeReceiver(typeReference: KtTypeReference): KtFunctionTypeReceiver defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'it' @ [105:81] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference.<anonymous>[ValueParameterDescriptorImpl]

'parameterList' @ [106:32] ==> public final val KtFunctionType.parameterList: KtParameterList?[MyPropertyDescriptor]

'firstChild' @ [106:49] ==> public final val KtFunctionType.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeReference' @ [106:88] ==> public final val KtFunctionTypeReceiver.typeReference: KtTypeReference[MyPropertyDescriptor]

