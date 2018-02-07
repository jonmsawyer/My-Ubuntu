################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/Module_03_Home.c \
../src/aux_03.c \
../src/reverse_string.c 

O_SRCS += \
../src/Module_03_Home.o \
../src/aux_03.o \
../src/reverse_string.o 

OBJS += \
./src/Module_03_Home.o \
./src/aux_03.o \
./src/reverse_string.o 

C_DEPS += \
./src/Module_03_Home.d \
./src/aux_03.d \
./src/reverse_string.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


