'ASM5' @ [26:58] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [31:28] ==> public abstract val access: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[PropertyDescriptorImpl]

'isSet' @ [31:35] ==> internal fun Int.isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles[SimpleFunctionDescriptorImpl]

'flag' @ [31:41] ==> value-parameter flag: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner.isSet[ValueParameterDescriptorImpl]

'isSet' @ [33:37] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_ABSTRACT' @ [33:51] ==> public const final val ACC_ABSTRACT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isSet' @ [34:35] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_STATIC' @ [34:49] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isSet' @ [35:34] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_FINAL' @ [35:48] ==> public const final val ACC_FINAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when {
            isSet(Opcodes.ACC_PRIVATE) -> Visibilities.PRIVATE
            isSet(Opcodes.ACC_PROTECTED) ->
                if (isStatic) JavaVisibilities.PROTECTED_STATIC_VISIBILITY else JavaVisibilities.PROTECTED_AND_PACKAGE
            isSet(Opcodes.ACC_PUBLIC) -> Visibilities.PUBLIC
            else -> JavaVisibilities.PACKAGE_VISIBILITY
        }' @ [37:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility, entry2: Visibility, entry3: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'isSet' @ [38:13] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_PRIVATE' @ [38:27] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'PRIVATE' @ [38:56] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isSet' @ [39:13] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_PROTECTED' @ [39:27] ==> public const final val ACC_PROTECTED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (isStatic) JavaVisibilities.PROTECTED_STATIC_VISIBILITY else JavaVisibilities.PROTECTED_AND_PACKAGE' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'isStatic' @ [40:21] ==> public open val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[PropertyDescriptorImpl]

'PROTECTED_STATIC_VISIBILITY' @ [40:48] ==> @NotNull public final val PROTECTED_STATIC_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PROTECTED_AND_PACKAGE' @ [40:98] ==> @NotNull public final val PROTECTED_AND_PACKAGE: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'isSet' @ [41:13] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_PUBLIC' @ [41:27] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'PUBLIC' @ [41:55] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [42:38] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'isSet' @ [45:48] ==> public open fun isSet(flag: Int): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.BinaryJavaModifierListOwner[SimpleFunctionDescriptorImpl]

'ACC_DEPRECATED' @ [45:62] ==> public const final val ACC_DEPRECATED: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'this' @ [48:37] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.isSet[ReceiverParameterDescriptorImpl]

'flag' @ [48:46] ==> value-parameter flag: Int defined in org.jetbrains.kotlin.load.java.structure.impl.classFiles.isSet[ValueParameterDescriptorImpl]

