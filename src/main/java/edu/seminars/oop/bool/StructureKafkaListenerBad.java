package edu.seminars.oop.bool;

import java.util.Objects;

public class StructureKafkaListenerBad {
    private void readKafkaMessageBad(StructureKafkaEntity structureKafkaEntity) {
        if (Objects.equals(structureKafkaEntity.entityType(), "ENTITY_TYPE_POSITION") &&
                Objects.equals(structureKafkaEntity.structureType(), "STRUCTURE_TYPE_LEGAL") &&
                Objects.equals(structureKafkaEntity.actionType(), "ACTION_TYPE_DELETED")) {
            System.out.println("Сценарий на случай удалении юридической позиции");
        }
    }
}
