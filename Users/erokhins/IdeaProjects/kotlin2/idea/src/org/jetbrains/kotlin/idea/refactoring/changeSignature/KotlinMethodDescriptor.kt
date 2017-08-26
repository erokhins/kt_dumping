'' @ [31:17] ==> private constructor Kind(isConstructor: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[ClassConstructorDescriptorImpl]

'' @ [32:28] ==> private constructor Kind(isConstructor: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[ClassConstructorDescriptorImpl]

'' @ [33:30] ==> private constructor Kind(isConstructor: Boolean) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[ClassConstructorDescriptorImpl]

'baseDescriptor' @ [37:26] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'when {
            descriptor !is ConstructorDescriptor -> Kind.FUNCTION
            descriptor.isPrimary -> Kind.PRIMARY_CONSTRUCTOR
            else -> Kind.SECONDARY_CONSTRUCTOR
        }' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinMethodDescriptor.Kind, entry1: KotlinMethodDescriptor.Kind, entry2: KotlinMethodDescriptor.Kind): KotlinMethodDescriptor.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Kind

'descriptor' @ [39:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.<get-kind>[LocalVariableDescriptor]

'FUNCTION' @ [39:58] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [40:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.<get-kind>[LocalVariableDescriptor]

'isPrimary' @ [40:24] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'PRIMARY_CONSTRUCTOR' @ [40:42] ==> enum entry PRIMARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'SECONDARY_CONSTRUCTOR' @ [41:26] ==> enum entry SECONDARY_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor.Kind[FakeCallableDescriptorForObject]

'baseDescriptor' @ [59:20] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'returnType' @ [59:35] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'?:' @ [60:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String?

'baseDeclaration' @ [60:21] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'typeReference' @ [60:65] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [60:80] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'type' @ [61:23] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-returnTypeInfo>[LocalVariableDescriptor]

'let' @ [61:29] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [61:35] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [61:58] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [61:91] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [61:102] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-returnTypeInfo>[LocalVariableDescriptor]

'KotlinTypeInfo' @ [63:16] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [63:37] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-returnTypeInfo>[LocalVariableDescriptor]

'text' @ [63:43] ==> val text: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-returnTypeInfo>[LocalVariableDescriptor]

'baseDescriptor' @ [68:20] ==> public abstract val baseDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [68:35] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [68:63] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'?:' @ [69:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String?

'baseDeclaration' @ [69:21] ==> public abstract val baseDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'receiverTypeReference' @ [69:65] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'text' @ [69:88] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'type' @ [70:23] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-receiverTypeInfo>[LocalVariableDescriptor]

'let' @ [70:29] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [70:35] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [70:58] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [70:91] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [70:102] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-receiverTypeInfo>[LocalVariableDescriptor]

'KotlinTypeInfo' @ [71:16] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [71:38] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-receiverTypeInfo>[LocalVariableDescriptor]

'text' @ [71:44] ==> val text: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.<get-receiverTypeInfo>[LocalVariableDescriptor]

