package org.pbreakers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Carnet {
    private Personne prorietaire;
    List<Personne> contacts = new List<Personne>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Personne> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Personne personne) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Personne> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Personne> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Personne get(int index) {
            return null;
        }

        @Override
        public Personne set(int index, Personne element) {
            return null;
        }

        @Override
        public void add(int index, Personne element) {

        }

        @Override
        public Personne remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Personne> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Personne> listIterator(int index) {
            return null;
        }

        @Override
        public List<Personne> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    Carnet(Personne p){
        this.prorietaire = p;
    }

    public Personne getProrietaire() {
        return prorietaire;
    }

    public void setProrietaire(Personne prorietaire) {
        this.prorietaire = prorietaire;
    }
}
